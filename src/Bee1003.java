import java.util.Scanner;

public class Bee1003 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int A;
        int B;
        int SOMA;
    
        A = tec.nextInt();
        B = tec.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        tec.close();
    }
}