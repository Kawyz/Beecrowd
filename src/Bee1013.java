import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int A = tec.nextInt();
        int B = tec.nextInt();
        int C = tec.nextInt();

        int maiorAB;
        int maiorABC;

        maiorAB = (A + B + Math.abs(A - B)) / 2 ;
        maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maiorABC + " eh o maior");

        tec.close();
    }
}
