import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{
    public static void main(String args[]){    
        int i = 1;  
        String champion = "";  
        while (!StdIn.isEmpty()){
            String word = StdIn.readString();
            if (word.isEmpty())
                break;
            //System.out.println(word);
            if (StdRandom.bernoulli(1/(i))){
                champion = word;
            }
            i++;
        }
        StdOut.println(champion);

    }
}