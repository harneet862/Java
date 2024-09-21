import java.util.*;

public class file13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int num1 = Character.getNumericValue(a.charAt(0));
        int num2 = Character.getNumericValue(a.charAt(2));
        switch (a.charAt(1)){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("Invalid statement");
                break;
        }
    }
}