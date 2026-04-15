package datas.dadosdelocalparaglobal;

import java.lang.reflect.InaccessibleObjectException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2020-04-14");
        LocalDateTime d05 = LocalDateTime.parse("2020-05-05T01:30:26");
        Instant d06 = Instant.parse("2026-04-14T01:30:26Z");



        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate NextWeekLocalDate = d04.plusDays(7);
        LocalDate NextYearsLocalDate = d04.plusYears(4);

        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate: " + NextWeekLocalDate);
        System.out.println("nextYearsLocalDate: " + NextYearsLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalInstant: " + pastWeekLocalInstant);
        System.out.println("nextWeekLocalInstant: " + nextWeekLocalInstant);

        // calculo com data hora
        // nao da para converter em localDate somente, tem que converte para localdatetime
        // atStartofday ja converte para meia noite sem vc colocar em parametros


        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay( ));
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekLocalInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekLocalInstant);

        System.out.println("t1 dias : " + t1.toDays());
        System.out.println("t2 dias : " + t2.toDays());
        System.out.println("t3 dias : " + t3.toDays());
        System.out.println("t4 dias : " + t4.toDays());

    }
}
