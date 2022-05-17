package opgave2;

public class App {
    public static void main(String[] args) {
        Bil b1 = new Bil("waudi4", "audi", "a4", "black");
        Bil b2 = new Bil("123456", "mercedes-benz", "c300", "white");
        Bil b3 = new Bil("nocell", "ford", "edge", "grey");

        DictionaryLinked<Bil, Integer> dict = new DictionaryLinked<>();
        dict.put(b1, 1);
        dict.put(b2, 4);
        dict.put(b3, 2);

        System.out.println(dict);
    }
}
