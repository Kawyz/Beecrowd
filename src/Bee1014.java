import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in); 

        float X;
        double Y;        
        double media;

        X = tec.nextInt();
        Y = tec.nextDouble();

        media = X / Y;

        System.out.printf("%.3f km/l%n", media);

        tec.close();
    }
}
