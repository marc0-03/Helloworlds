import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DAY12018 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input12018"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] tal = new int[1025];
        int count = 0;
        int x = 0;
        int y = 0;
        int[] tem = new int[1025];

        while (in.hasNext()) {
            tal[count++] = in.nextInt();
        }

        for (int i = 0 ; i < tal.length ; i++) {
            x = x + tal[i];
            tem[i] = x;
        }
        for (int k = 0 ; k < tal.length ; k++) {
            y = y + tal[k];
            if (y == tem[k]) {
                System.out.println(y);
                break;
            }
        }
    }
}
