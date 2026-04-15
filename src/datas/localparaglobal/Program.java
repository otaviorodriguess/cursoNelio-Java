package datas.localparaglobal;

import java.time.*;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2020-04-14");
        LocalDateTime d05 = LocalDateTime.parse("2020-05-05T01:30:26");
        Instant d06 = Instant.parse("2026-04-14T01:30:26Z");


        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1.toString());
        System.out.println("r2 = " + r2.toString());
        System.out.println("r3 = " + r3.toString());
        System.out.println("r4 = " + r4.toString());

        System.out.println("do4 dia = "+ d04.getDayOfMonth());
        System.out.println("do4 mes = "+ d04.getMonthValue());
        System.out.println("do4 ano = "+ d04.getYear());

        System.out.println("d05 hora : "+ d05.getHour());
        System.out.println("d05 min : "+ d05.getMinute());
    }
}
