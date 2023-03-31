import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate data01 = LocalDate.parse("2023-03-29");
        LocalDateTime data02 = LocalDateTime.parse("2023-03-29T01:20:20");
        Instant data03 = Instant.parse("2023-03-29T01:20:20Z");

        LocalDate pastWeekLocalDate = data01.minusDays(7); // DIMINUI 7 DIAS;
        LocalDate nextWeekLocalDate = data01.plusDays(7); // AUMENTA 7 DIAS;
        System.out.println("\n\npastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);


        LocalDateTime pastWeekLocalDateTime = data02.minusDays(7); // DIMINUI 7 DIAS;
        LocalDateTime nextWeekLocalDateTime = data02.plusDays(7); // AUMENTA 7 DIAS;
        System.out.println("\n\npastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);


        Instant pastWeekLocalInstant = data03.minus(7, ChronoUnit.DAYS); // DIMINUI 7 DIAS;
        Instant nextWeekLocalInstant = data03.plus(7, ChronoUnit.DAYS); // AUMENTA 7 DIAS;
        System.out.println("\n\npastWeekLocalDateTime: " + pastWeekLocalInstant);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalInstant);


        Duration duracao1 =  Duration.between(pastWeekLocalDate.atStartOfDay(), data01.atStartOfDay());
        Duration duracao2 = Duration.between(pastWeekLocalDateTime, data02);
        Duration duracao3 = Duration.between(pastWeekLocalInstant, data03);
        Duration duracao4 = Duration.between(data03, pastWeekLocalInstant);

        System.out.println("\n\nDuração1 dias: " + duracao1.toDays());
        System.out.println("Duração2 dias: " + duracao2.toDays());
        System.out.println("Duração3 dias: " + duracao3.toDays());
        System.out.println("Duração4 dias: " + duracao4.toDays());
    }
}
