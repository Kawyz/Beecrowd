import java.util.Locale;
import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        double A;
        double B;
        double C;
        double media;

        A = tec.nextDouble();
        B = tec.nextDouble();
        C = tec.nextDouble();

        media = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    
        tec.close();
    }
}
