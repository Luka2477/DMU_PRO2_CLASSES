package opgave5;

public interface Observer {

    default void update (String s, int antal) {
        System.out.printf("String %s er blevet ændret, og der findes nu %d antal.%n", s, antal);
    }

}
