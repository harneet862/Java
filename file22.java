import java.util.*;

public class file22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                if ((i == 1 || i == 2) && (j == 1 || j ==2 || j ==3))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}