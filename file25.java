public class file25{
    public static void main(String args[]){
        /*for (int i = 0; i < 4; i++){
            for (int j = 0; j <4; j++){
                if (i+j >= 3)
                    System.out.print("*");
                else   
                    System.out.print(" ");
            }
            System.out.print("\n");
        }*/
        for (int i = 1; i < 4; i++){
            for (int j = 1; j <4 -i; j++){
                System.out.print(" ");}
            for (int j = 1; j <4; j++){
                 System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
