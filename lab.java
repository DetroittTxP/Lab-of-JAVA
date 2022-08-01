import java.util.Scanner;

public class lab {
    public static void main(String[] args){
        //Lab4

        int m = 0;
        int ot = 0,oot;

        Scanner ppp = new Scanner(System.in);
        System.out.println("Enter hrs:");
        int x = ppp.nextInt();

        if(x == 40){
            m = 40*120;
            System.out.println(m);
        } else if (x>40) {
            ot = x - 40;
            oot = ot * 20;
            m = 40*120 + oot;
            System.out.println(m);
        }
        else {
            System.out.println("No money for you kub");
        }
    }

}
