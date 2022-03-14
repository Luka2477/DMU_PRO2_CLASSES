package opgave3;

public class Ellipse extends FigurComponent {

    private String name;
    private final double radius1, radius2;

    public Ellipse(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
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
        return radius1 * radius2 * Math.PI;
    }

}
