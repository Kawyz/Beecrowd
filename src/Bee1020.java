import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int anos;
        int meses;
        int dias;

        dias = tec.nextInt();

        anos = dias / 365;
        dias = dias % 365;
        meses = dias / 30;
        dias = dias % 30;        

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        tec.close();
    }
}
