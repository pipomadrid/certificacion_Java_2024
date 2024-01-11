package ManipulacionFechas;

import java.time.*;

public class javaTime {
    //Uso de varias clases para manipular fechas
    //No disponen de constructores, se crean mediante métodos estáticos(of)

    public static void main(String[] args) {
        var f1 = LocalDate.of(1950,12,24);
        var f2 = LocalDate.of(1950, Month.APRIL,24);
        var h1 = LocalTime.of(15,30,20);
        var lt1 = LocalDateTime.of(2010,Month.DECEMBER,19,22,30);
        var lt2 = LocalDateTime.of(f1,h1);
        var zi = ZoneId.of("Europe/Amsterdam");
        var zd1 = ZonedDateTime.of(f2,h1,zi);

        System.out.println("Fecha " + f1);
        System.out.println("Hora " + h1);
        System.out.println("Fecha y hora  " + lt1);
        System.out.println("Zona horaria " + zi);
        System.out.println("Fecha y hora de la zona horaria " + zd1);

        //PARSEADO
        //Se pueden crear objetos de fecha-hora a partir de una cadena de caracteres
        var f3 = LocalDate.parse("2021-10-20");
        var h2 = LocalTime.parse("22:00:45");
        var lt3 = LocalDateTime.parse("2019-06-03T16:15:30");
        var zd2 = ZonedDateTime.parse("2019-06-03T16:15:30+01:00[Europe/Amsterdam]");
        System.out.println("Fecha " + f3);
        System.out.println("Hora " + h2);
        System.out.println("Fecha y hora  " + lt3);
        System.out.println("Fecha y hora de la zona horaria  " + zd2);

        //Manipulación mediante métodos
        //El objeto original no se modifica
        var f1mod = f1.minusDays(2);
        var h1mod = h1.plusSeconds(10);
        System.out.println(f1mod);
        System.out.println(h1mod);

        //INSTANT
        //Representa un momento de tiempo concreto en la zona GMT
        var i1 = Instant.now();
        var i2 = Instant.ofEpochSecond(2000000);//momento dos millones de segundo después de 1970-01-01T00:00.00
        System.out.println(i1);
        System.out.println(i2);

        //PERIOD
        //Representa periodo de tiempo medido en años,meses y dias
        Period p1 = Period.of(2,5,11);
        Period p2 = Period.ofYears(5);
        Period p3 = Period.ofDays(20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        //Se pueden sumar y restar a objetos fecha pero no a LocalTime
        var f4 = f1.minus(p1);
        System.out.println(f4);

        //Se puede obtener intervalo de fechas a través de Between() de period
        //Sólo con LocalDate
        System.out.println(Period.between(f1,f4));

        //DURATION
        //Representa intervalo en horas, minutos y segundos
        Duration d1 = Duration.ofDays(2); //Se almacena en Horas PT48H
        Duration d2 = Duration.ofSeconds(150);
        Duration d3 = Duration.ofHours(5);
        Duration d4 = d1.plus(d2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        //El intervalo entre Duration se obtiene mediante between()
        var t1 = LocalTime.of(2,30,0);
        var t2 = LocalTime.of(1,30,0);
        System.out.println(Duration.between(t1,t2));
    }
}
