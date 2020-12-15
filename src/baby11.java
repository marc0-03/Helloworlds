import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class baby11 {
    public static void main(String[] args) {
        double[] a = new double[10];
        int i = a.length;
        int k = i;
        double z = 0;
        while (k>0) {
            z = k+1;
            a[k-1] = 1/z;
            k = k-1;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(a));
    }
}
