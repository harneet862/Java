import java.util.*;

public class file20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean j = false;

        for (int i =2; i <= (Math.sqrt(n)); i++){
            if (n % i == 0){
                j = true;
                break;
            }
        }

        if (j == true){
            System.out.println("The number " + n + " is not prime");
        }else{
            System.out.println("The number " + n + " is prime");
        }
        sc.close();
    }
}