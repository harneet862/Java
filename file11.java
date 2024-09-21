import java.util.*;

public class file11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        /*if (a == 1)
            System.out.println("Hello");
        else if (a == 2)
            System.out.println("Namaste");
        else if (a == 3)
            System.out.println("Bonjour"); */

        switch(a) {
            case 1: System.out.println("Hello");
                break;
            case 2 : System.out.println("Namaste");
                break;
            case 3 : System.out.println("Bonjour");
                break;
            default : System.out.println("Invalid statement");
        }
    }
}