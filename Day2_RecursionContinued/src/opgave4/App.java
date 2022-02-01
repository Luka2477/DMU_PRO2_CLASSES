package opgave4;

public class App {

    public static int A (int x, int y) {
        if (x == 0) {
            return y+1;
        } else if (y == 0) {
            return A(x-1, 1);
        } else {
            return A(x-1, A(x, y-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(A(1, 3));
    }

}
