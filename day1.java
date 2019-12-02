import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class day1 {
    

    public static void main(String[] args) throws IOException {
        File text = new File("day1Input.txt");
        Scanner s = new Scanner(text);
        int sum = 0;
        while (s.hasNext()) {
            sum += (Integer.parseInt(s.nextLine()) / 3) - 2;
        }
        System.out.println(sum);
    }
}