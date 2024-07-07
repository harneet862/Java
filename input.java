import java.util.Scanner;

public class input{
    public static void main(String args[]){
        //Like we use the class system for the output we use the class Scanner for input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // this will take the entire line
        // if you just need a word use sc.next
        //nextInt(), nextFlaot()
        System.out.println(name);
    }
}