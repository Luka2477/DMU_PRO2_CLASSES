package opgave2;

public class App {

    public static int power (int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return power(n, p-1)*n;
        }
    }

    public static int power2 (int n, int p) {
        if (p == 0) {
            return 1;
        } else if (p % 2 == 1) {
            return power(n, p-1)*n;
        } else {
            return power(n*n, p/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(power2(2, 5));
    }

}
