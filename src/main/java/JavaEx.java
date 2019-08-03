import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaEx {
    public static void main(String args[]){
        System.out.println("JavaEx");
        LocalDate localDate = LocalDate.now();
        System.out.println("Now: "+ localDate);

        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE);
        System.out.println("Now FR: " + localDate.format(format));
    }
}
