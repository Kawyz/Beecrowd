import java.util.Scanner;
import java.util.Locale;

public class Bee1002 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double area;
        double raio;
        double n = 3.14159;

        raio = tec.nextDouble();

        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

        tec.close();
    }
}
