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

        System.out.println(arrayOfInput.toString());

        int a = 0, b = 0, outPutIndex = 0;

        for (int i = 0; i < arrayOfInput.size() - 1; i++) {
            if (arrayOfInput.get(i) == 99) {
                break;
            }
            else if (arrayOfInput.get(i) == 1) {
                a = arrayOfInput.get(arrayOfInput.get(i+1));
                b = arrayOfInput.get(arrayOfInput.get(i+2));
                outPutIndex = arrayOfInput.get(i+3);

                arrayOfInput.set(outPutIndex,(a+b));
                i+=3;
            }
            else if (arrayOfInput.get(i) == 2) {
                a = arrayOfInput.get(arrayOfInput.get(i+1));
                b = arrayOfInput.get(arrayOfInput.get(i+2));
                outPutIndex = arrayOfInput.get(i+3);

                arrayOfInput.set(outPutIndex,(a*b));
                i+=3;
            } 
        }
        System.out.println();
        System.out.println(arrayOfInput.toString());
    }
}