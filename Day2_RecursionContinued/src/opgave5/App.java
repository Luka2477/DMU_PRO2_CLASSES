package opgave5;

public class App {

    public static int binomial (int n, int m) {
        if (m == 0 || m == n) {
            return 1;
        } else if (0 < m && m < n) {
            return binomial(n-1, m) + binomial(n-1, m-1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(binomial(6, 3));
    }

}
