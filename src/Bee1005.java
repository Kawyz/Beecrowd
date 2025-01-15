import java.util.Locale;
import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        double A;
        double B;
        double media;

        A = tec.nextDouble();
        B = tec.nextDouble();

        media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        tec.close();
    }
}
