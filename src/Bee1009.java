import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double totalReceber;
        double comissao;
        double vendasRealizadas;

        nomeVendedor = tec.nextLine();
        salarioFixo = tec.nextDouble();
        vendasRealizadas = tec.nextDouble();

        comissao = vendasRealizadas * 0.15;

        totalReceber = salarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", totalReceber);

        tec.close();
    }
}