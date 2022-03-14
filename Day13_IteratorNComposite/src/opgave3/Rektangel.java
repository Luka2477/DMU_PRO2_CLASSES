package opgave3;

public class Rektangel extends FigurComponent {

    private String name;
    private final double length, width;

    public Rektangel(double length, double width) {
        this.length = length;
        this.width = width;
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
        return length * width;
    }

}
