package opgave2;

public class AnvendCounter {

    public static void main(String[] args) {
        Counter c = Counter.getInstance();

        System.out.println(c.getValue());
        c.count();
        System.out.println(c.getValue());
        c.count();
        c.times2();
        System.out.println(c.getValue());
        c.zero();
        System.out.println(c.getValue());
    }

}
