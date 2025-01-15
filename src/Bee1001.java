import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int A;
        int B;
        int X;

        A = tec.nextInt();
        B = tec.nextInt();

        X = A + B;

        System.out.println(X);
        
        tec.close();
    }
}
