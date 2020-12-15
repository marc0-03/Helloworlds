
/*
använd "Scanner in = new Scanner(System.in)" och "import java.util.Scanner;" när du ska läsa
 in från datorn och inte en text ruta. och "System.out.println("text här");"
 */


/*
 public static int Namn(int x) {
      int är vad du får tillbaka
      du skriver Meth.Namn() för att använda
      (int x) betyder att du sätter in en int i metoden.
 */

public class Meth {

    public static double CirkelArea(double radie) {
        double x =radie*radie;
        return x*3.145926536;
    }
    public static double CirkelOmkrets(double radie) {
        radie = radie*2;
        return radie*3.1415926536;
    }
    public static boolean ärskottår(int år) {
        if (år % 4 == 0 && år % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int antal(int tal) {
        int i = 0;
        while (tal > 0 ) {
            i = i+1;
            tal = tal/10;
        }
        return i;
    }
    public static String visainfo() {
        String x;
        x = System.getProperty("user.name");
        x = "namn " + x + "\noperativsystem " + System.getProperty("os.name");
        return x;
    }
}
