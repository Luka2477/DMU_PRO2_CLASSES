package opgave3;

public abstract class FigurComponent {

    public void add (FigurComponent figurComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove (FigurComponent figurComponent) {
        throw new UnsupportedOperationException();
    }

    public FigurComponent getChild (int i) {
        throw new UnsupportedOperationException();
    }

    public String getName () {
        throw new UnsupportedOperationException();
    }

    public void setName (String name) {
        throw new UnsupportedOperationException();
    }

    public void tegn () {
        throw new UnsupportedOperationException();
    }

    public double getAreal () {
        throw new UnsupportedOperationException();
    }

}
