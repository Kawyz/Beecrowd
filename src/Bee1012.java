import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        double A = tec.nextDouble();
        double B = tec.nextDouble();
        double C = tec.nextDouble();

        double triangulo = A * C / 2; //base x altura / 2
        double circulo = 3.14159 * Math.pow(C, 2); //pi x raio^2
        double trapezio = (A + B) * C / 2; //(base1 + base2) x altura / 2
        double quadrado = B * B; //lado x lado
        double retangulo = A * B; //lado1 x lado2

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        tec.close();
    }
}
