import java.util.Scanner;
import java.util.Locale;

public class Bee1010 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);

        int codPeca01;
        int quantPeca01;
        double valPeca01;

        int codPeca02;
        int quantPeca02;
        double valPeca02;

        double valorPagar;
        
        codPeca01 = tec.nextInt();
        quantPeca01 = tec.nextInt();
        valPeca01 = tec.nextDouble();

        codPeca02 = tec.nextInt();
        quantPeca02 = tec.nextInt();
        valPeca02 = tec.nextDouble();

        valorPagar = (valPeca01 * quantPeca01) + (valPeca02 * quantPeca02);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);

        tec.close();
    }
}
