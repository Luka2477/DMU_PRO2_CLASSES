package opgave7;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static int talN (int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 5;
        } else if (n%2 == 0) {
            return 2*talN(n-3)-talN(n-1);
        } else {
            return talN(n-1)+talN(n-2)+3*talN(n-3);
        }
    }

    public static int iterativTalN (int n) {
        ArrayList<Integer> tal = new ArrayList<>(Arrays.asList(2, 1, 5));

        for (int i = 3; i <= n; i++) {
            if (i%2 == 0) {
                tal.add(2*tal.get(i-3)-tal.get(i-1));
            } else {
                tal.add(tal.get(i-1)+tal.get(i-2)+3*tal.get(i-3));
            }
        }

        return tal.get(n);
    }

    public static void main(String[] args) {
        for (int i = 3; i <= 6; i++) {
            System.out.println(talN(i));
            System.out.println(iterativTalN(i));
        }
    }

}
