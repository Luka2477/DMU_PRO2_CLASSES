package opgave4;

public class Demo {
    public static void main(String[] args) {
        PostFixEvaluator pfe = new PostFixEvaluator();
        System.out.println(pfe.evaluate("12 2 5 + - 4 * 2 /"));
        System.out.println(pfe.evaluate("5 3 + 8 2 - *"));
    }
}
