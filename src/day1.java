import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input1"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] tal = new int[200];
        int count = 0;

        while (in.hasNext()) {
            tal[count++] = in.nextInt();
        }

        for (int i = 0 ; i < tal.length ; i++) {
            for (int k = 0 ; k < tal.length ; k++) {
                for (int l = 0 ; l < tal.length ; l++) {
                if (tal[i]+tal[k]+tal[l] == 2020) {

                    if (tal[i] != tal[k]) {
                        if (tal[i] != tal[l]){
                            if (tal[l] != tal[k]) {
                                int x = tal[i] * tal[k] * tal[l];
                        System.out.println(x);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
