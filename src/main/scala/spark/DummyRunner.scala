package spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object DummyRunner extends App {

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

  val rdd = sc.parallelize(Seq(1,2,3,4,5))

  import spark.implicits._

  val df = rdd.toDF.show()

}
