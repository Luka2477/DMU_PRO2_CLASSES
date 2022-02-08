package opgave3;

import java.util.Arrays;

public class App {

    // Big Oh: O(n)
    public static double[] prefixAverage (int[] inputTal) {
        double[] result = new double[inputTal.length];
        int sum = 0;

        for (int i = 0; i < inputTal.length; i++) {
            sum += inputTal[i];
            result[i] = sum/(i+1.0);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefixAverage(new int[]{5, 10, 5, 6, 4, 9, 8})));
    }

}
