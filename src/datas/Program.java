package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // duplicar linha ctrl + D

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-04-11");
        LocalDateTime d05 = LocalDateTime.parse("2026-04-11T23:20:30");
        Instant d06 = Instant.parse("2026-04-11T23:20:30Z");
        Instant d07 = Instant.parse("2026-04-11T23:20:30-03:00");

        LocalDate d08 = LocalDate.parse("11/04/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("11/04/2026 01:00", fmt2);

        LocalDate d10 = LocalDate.of(2026, 4,11);
        LocalDateTime d11 = LocalDateTime.of(2026, 4, 22, 1, 30);

        System.out.println("d01 = "+ d01.toString());
        System.out.println("d02 = "+ d02.toString());
        System.out.println("d03 = "+ d03.toString());
        System.out.println("d04 = "+ d04.toString());
        System.out.println("d05 = "+ d05.toString());
        System.out.println("d06 = "+ d06.toString());
        System.out.println("d07 = "+ d07.toString());
        System.out.println("d08 = "+ d08.toString());
        System.out.println("d09 = "+ d09.toString());
        System.out.println("d10 = "+ d10.toString());
        System.out.println("d11 = "+ d11.toString());
        System.out.println();

    }
}
