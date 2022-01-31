package opgave5;

public class App {

    public static int sfd (int a, int b) {
        if (b <= a && a%b == 0) {
            return b;
        } else if (a < b) {
            return sfd(b, a);
        } else {
            return sfd(b, a%b);
        }
    }

    public static void main(String[] args) {
        System.out.println(sfd(24, 128));
    }

}
