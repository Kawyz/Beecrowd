import java.util.Scanner;

public class Bee1004 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int V1;
        int V2;
        int PROD;

        V1 = tec.nextInt();
        V2 = tec.nextInt();

        PROD = V1 * V2;

        System.out.println("PROD = " + PROD);
        
        tec.close();
    }
}
