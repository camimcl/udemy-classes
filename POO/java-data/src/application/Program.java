package application;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        //https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/time/format/DateTimeFormatter.html
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();//data e hora local
        Instant d4 = Instant.now();//data global gmt (londres)

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formato customizado
        LocalDate d3 = LocalDate.parse("24/07/2024",fmt1);
        LocalDate d8 = LocalDate.parse("2024-08-04");
        LocalDateTime d5 = LocalDateTime.parse("2022-07-24T18:42:32");//data local
        Instant d6 = Instant.parse("2022-07-24T18:42:32Z"); // instant para gmt
        Instant d7 = Instant.parse("2022-07-24T18:42:32-03:00"); //gmt -3
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //para formatar o instant precisa dizer o fuso pois ele é relativo, com esse comando ele pega o da regiao do pc

        //conversao de data global para data local considerando o fuso do seu pc
        LocalDate r1 = LocalDate.ofInstant(d6,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));

        Instant pastweek = d6.minus(7, ChronoUnit.DAYS);
        LocalDateTime pastweek2 = d2.minusDays(7);
        LocalDateTime nextweek = d2.plusDays(7);

        Duration t1 = Duration.between(pastweek2,nextweek);
        Duration t2 = Duration.between(r1.atStartOfDay(),r2.atTime(0,0));
        //nao pode-se calcular a duração se usar localdates, apenas se houver uma conversao para localdatetime
        //metodo ".atTime","atStartOfDay();.



        System.out.println(t1.toDays());
        System.out.println("d04 dia: "+d5.getDayOfMonth());
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(d8.format(fmt1));
        System.out.println(fmt1.format(d5));
        System.out.println(fmt2.format(d5));
        System.out.println(fmt3.format(d6));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }


}
