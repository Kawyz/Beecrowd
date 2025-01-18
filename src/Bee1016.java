import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int minutos;
        int km;

        km = tec.nextInt();
        minutos = (60 * km) / 30;

        System.out.println(minutos + " minutos");
        
        tec.close();
    }
}
