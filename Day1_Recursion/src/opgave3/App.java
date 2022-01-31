package opgave3;

public class App {

    public static int product (int a, int b) {
        if (a == 0) {
            return 0;
        } else {
            return product(a-1, b) + b;
        }
    }

    public static int productRus (int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a % 2 == 1) {
            return productRus(a-1, b)+b;
        } else {
            return productRus(a/2, 2*b);
        }
    }

    public static void main(String[] args) {
        System.out.println(product(12, 3));
        System.out.println(productRus(12, 3));
    }

}
