import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();

        LocalDate data04 = LocalDate.parse("2023-07-20");
        LocalDateTime data05 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant data06 = Instant.parse("2023-07-20T01:30:26Z");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Instant data07 = sdf.parse("2022-07-20T01:30:26-03:00").toInstant(); 

        //LocalDate data08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate data08 = LocalDate.parse("20/07/2022", formato1);
        LocalDateTime data09 = LocalDateTime.parse("20/07/2023 01:30", formato2);

        LocalDate data10 = LocalDate.of(2023, 07, 20);
        LocalDateTime data11 = LocalDateTime.of(2023, 7, 20, 1, 30);


        System.out.println();
        System.out.println("Data 01: " + data01.toString()); 
        System.out.println("Data 02: " + data02.toString()); 
        System.out.println("Data 03: " + data03.toString()); 
        System.out.println("Data 04: " + data04.toString()); 
        System.out.println("Data 05: " + data05.toString()); 
        System.out.println("Data 06: " + data06.toString()); 
        System.out.println("Data 07: " + data07.toString()); 
        System.out.println("Data 08: " + data08.toString()); 
        System.out.println("Data 09: " + data09.toString()); 
        System.out.println("Data 10: " + data10.toString()); 
        System.out.println("Data 11: " + data11.toString()); 
















        System.out.println();
        System.out.println();
    }
}
