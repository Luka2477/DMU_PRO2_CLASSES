package opgave6;

public class App {

    // Jeg kan ud fra at skrive flere resultater ned, betegne
    // at hvor mange dominobrikker der kan være på n-strimmlen,
    // har direkt relation til Fibonacci sekvensen
    // f(n) : f(n-2)+f(n-1)
    //
    // td : n, n <= 1
    // rd : dom(n-2)+dom(n-1), n > 1
    public static int dom (int n) {
        if (n <= 1) {
            return 1;
        } else {
            return dom(n-2)+dom(n-1);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            System.out.printf("n=%d, m=%d%n", i, dom(i));
        }
    }

}
