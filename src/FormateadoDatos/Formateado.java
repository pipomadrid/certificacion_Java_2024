package FormateadoDatos;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Formateado {


    public static void main(String[] args) {
        //NUMBERFORMAT -> Numeros
        double salario = 1256.678;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nf.format(salario));

        //DATAFORMAT -> Formatear fechas
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL ,Locale.US);
        System.out.println(df.format(new Date()));

        //DATETIMEFORMATTER -> Formateo nuevas clases fecha

        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(ld));
    }
}
