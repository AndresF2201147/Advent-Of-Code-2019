import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;

public class day2 {
    
    public static void main(String[] args) throws IOException {
        File text = new File("day2Input.txt");
        Scanner s = new Scanner(text);
        ArrayList<Integer> arrayOfInput = new ArrayList<Integer>();
        
        String[] line = s.nextLine().split(",");

        for (String num : line) {
            arrayOfInput.add(Integer.parseInt(num));
        }
        
        

        // boolean keepGoing = true;
        // while (keepGoing) {

        // }
    }
}