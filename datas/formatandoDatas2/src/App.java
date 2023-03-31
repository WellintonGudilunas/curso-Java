import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate data01 = LocalDate.parse("2023-03-29");
        LocalDateTime data02 = LocalDateTime.parse("2023-03-29T13:20:20");
        Instant data03 = Instant.parse("2023-03-29T02:20:20Z");
        
        System.out.println();
        System.out.println();

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("DATA 1: " + data01.format(formato1));
        System.out.println("DATA 1: " + formato1.format(data01));
        System.out.println("DATA 1: " + data01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DATA 2: " + data02.format(formato1));
        System.out.println("DATA 2: " + data02.format(formato2));
        System.out.println("DATA 2: " + data02.format(formato4));
        System.out.println("------------------------------------------------------------------------");
        System.out.println("DATA 3: " + formato3.format(data03));
        System.out.println("DATA 3: " + formato5.format(data03));
        System.out.println("DATA 3: " + data03);

        System.out.println();
        System.out.println();


    }
}
