import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate data01 = LocalDate.parse("2023-03-29");
        LocalDateTime data02 = LocalDateTime.parse("2023-03-29T01:20:20");
        Instant data03 = Instant.parse("2023-03-29T01:20:20Z");

        // for(String s : ZoneId.getAvailableZoneIds()){
        //     System.out.println(s);
        // }
        LocalDateTime resultado1 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
        LocalDateTime resultado2 = LocalDateTime.ofInstant(data03, ZoneId.of("Portugal"));
        System.out.println();
        System.out.println();
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);

        System.out.println();
        System.out.println("DATA 1 DIA = " + data01.getDayOfMonth());
        System.out.println("DATA 1 MES = " + data01.getMonthValue());
        System.out.println("DATA 1 DIA = " + data01.getDayOfMonth());
        System.out.println();
        System.out.println("DATA 2 HORA = " + data02.getHour());
        System.out.println("DATA 2 MINUTO = " + data02.getMinute());
        System.out.println();
        System.out.println();
        
    }
}
