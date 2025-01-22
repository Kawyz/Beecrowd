import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        double quantidadeGasta;
        double distanciaPercorrida;

        double tempoGasto = tec.nextDouble();
        double velocidadeMedia = tec.nextDouble();

        distanciaPercorrida = tempoGasto * velocidadeMedia;

        quantidadeGasta = distanciaPercorrida / 12;

        System.out.printf("%.3f%n", quantidadeGasta);

        tec.close();
    }
}
