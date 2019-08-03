package spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.functions._
import org.apache.spark.sql.expressions._

object OverlapMerger extends App {

  println("go")

  val sparkConf = new SparkConf()
                        .setMaster("local[2]")
                        .setAppName("MySparkApp")



  val sc = new SparkContext(sparkConf)

  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.some.config.option", "some-value")
    .getOrCreate()

  val rdd = sc.parallelize(Seq(
      Seq(1,2,3,4,5),
      Seq(1,2,3,4,5,8),
      Seq(1,2,3,4,5,7),
      Seq(2,2,3,4,6)
  ))

  import spark.implicits._

  val df = rdd.toDF("colA")
  val df2 = df.withColumn("colB", df.col("colA").getItem(0))

  df2.show()

  val df3 = df2.groupBy(col("colB")).agg(collect_set("colA").alias("colA"))
  df3.show()
  df3.printSchema()

  val xxx = udf((x:Seq[Seq[Int]]) => {x.flatMap(i => i).distinct})
  val df4 = df3.withColumn("colA", xxx($"colA"))

  df4.show(20,false)
}
