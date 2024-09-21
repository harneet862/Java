import java.util.*;   // this is required for scanner function to take input

public class file5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // we made an scanner type object
        //String name = sc.next(); // next will only take one token
        String name = sc.nextLine(); // this will take entire line 
        //nextint(), nextfloat()
        System.out.println("Hello " + name);
    }
}