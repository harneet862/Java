import java.util.*;
public class file19{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if ( i == 1){
            int num = sc.nextInt();
            if (num >= 90){
                System.out.println("this is good");
            } else if ( num >= 60){
                System.out.println("This is also good");
            } else if (num >= 0){
                System.out.println("this is good as well");
            }
        } else if (i == 0){
            System.exit(0);
        }
    }
}