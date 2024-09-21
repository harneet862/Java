import java.util.*;
public class file8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("The individual is adult");
        }else{
            System.out.println("the individual is minor");
        }
    }
}