import java.util.Locale;
import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double x1, x2;
        double y1, y2;
        double distancia;

        x1 = tec.nextDouble();
        y1 = tec.nextDouble();
        x2 = tec.nextDouble();
        y2 = tec.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", distancia);

        tec.close();
    }
}
