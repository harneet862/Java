public class file30{
    public static void main(String args[]){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j <9; j++){
                if (4 <=(i+j) && (i+j) <= 8)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.print("\n");

        }
    }
}