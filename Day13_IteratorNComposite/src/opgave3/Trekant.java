package opgave3;

public class Trekant extends FigurComponent {

    private String name;
    private final double height, base;

    public Trekant (double height, double base) {
        this.height = height;
        this.base = base;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void tegn () {
        System.out.println(name);
    }

    public double getAreal () {
        return height * base / 2;
    }

}
