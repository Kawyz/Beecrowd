import java.util.Locale;
import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        double volume;
        double pi = 3.14159;
        int R;

        R = tec.nextInt();

        volume = (4/3.0) * pi * Math.pow(R,3);

        System.out.printf("VOLUME = %.3f\n", volume);

        tec.close();
    }
}
