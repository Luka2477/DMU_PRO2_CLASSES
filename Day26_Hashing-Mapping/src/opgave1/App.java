package opgave1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        Bil b1 = new Bil("waudi4", "audi", "a4", "black");
        Bil b2 = new Bil("waudi4", "audi", "a4", "black");
        Bil b3 = new Bil("waudi4", "audi", "a4", "black");
        Bil b4 = new Bil("waudi4", "audi", "a4", "black");

        HashSet<Bil> hs = new HashSet<>();
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        hs.add(b4);

        System.out.println(hs);
    }
}
