package Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test {

    public static void main(String[] args) {
        var ldt1 = LocalDateTime.of(2020,11,20,22,30,15);
        var ldt2 = LocalDateTime.of(2020,11,21,01,30,15);
        var zdt1 = ZonedDateTime.of(ldt1, ZoneId.of("Europe/Amsterdam"));
        var zdt2 = ZonedDateTime.of(ldt2, ZoneId.of("America/New_York"));
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(Duration.between(zdt1,zdt2));

        int a = 3, b = 5, c;
        c = (a<b)?a*a:b--;
        System.out.println(c);

    }
}
