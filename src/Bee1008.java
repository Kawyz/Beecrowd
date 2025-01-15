import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        int num;
        int horasTrabalhadas;
        double valorHora;
        double salario;

        num = tec.nextInt();
        horasTrabalhadas = tec.nextInt();
        valorHora = tec.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        tec.close();
    }
}
