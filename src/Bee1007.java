import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;

        A = tec.nextInt();
        B = tec.nextInt();
        C = tec.nextInt();
        D = tec.nextInt();

        DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        tec.close();
    }
}
