package opgave3;

public class App {

    public static void main(String[] args) {
        FigurComponent figure1 = new FigurComposite("Figure 1");
        figure1.add(new Trekant(5, 2));

        FigurComponent figure2 = new FigurComposite("Figure 2");
        figure2.add(new Rektangel(10.5, 15.2));
        figure2.add(new Ellipse(2, 3.5));

        FigurComponent figure3 = new FigurComposite("Figure 3");
        figure3.add(new Ellipse(5, 4));

        FigurComponent figure4 = new FigurComposite("Figure 4");
        figure4.add(new Trekant(1, 2.5));
        figure4.add(new Ellipse(4, 5));
        figure4.add(new Rektangel(15, 16));
        figure4.add(new Trekant(3, 4));

        FigurComponent figure5 = new FigurComposite("Figure 5");
        figure5.add(new Rektangel(2.5, 5.5));
        figure5.add(new Trekant(1, 2));

        FigurComponent allFigures = new FigurComposite("All Figures");
        allFigures.add(figure1);
        allFigures.add(figure2);
        allFigures.add(figure3);
        allFigures.add(figure4);
        allFigures.add(figure5);

        allFigures.tegn();
        System.out.println(allFigures.getAreal());
        System.out.println(figure4.getAreal());
    }

}
