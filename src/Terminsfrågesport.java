import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Terminsfrågesport {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("frågortillremin"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] tal = new String[50];
        int count = 0;
        int i = 1;

        while (in.hasNext()) {
            tal[count++] = in.nextLine();
        }
        System.out.println("Välkomen till ");
        while ( 1<11) {
        System.out.println("");
        }
    }
}
