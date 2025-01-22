import java.util.Locale;
import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        int N;
        int horas;
        int minutos;
        int segundos;

        N = tec.nextInt();

        horas = N / 3600;
        segundos = N % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        System.out.println(horas + ":"  + minutos + ":" + segundos);

        tec.close();
    }
}
