package opgave5;

public class App {

    public static void main(String[] args) {
        ObservableBag ob = new ObservableBag();
        ob.addString("Lukas");
        ob.addString("Mads");
        ob.addString("Lukas");

        System.out.println();
        for (String s : ob) {
            System.out.printf("%s | %d%n", s, ob.getCount(s));
        }
        System.out.println();

        ob.removeString("Lukas");
    }

}
