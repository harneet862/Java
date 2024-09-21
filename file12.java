import java.util.*;

public class file12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String oper = sc.next();
        int b = sc.nextInt();

        switch (oper){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
                break;
        }
    }
}