package opgave3;

import java.util.ArrayList;
import java.util.List;

public class FigurComposite extends FigurComponent {

    List<FigurComponent> figurComponents = new ArrayList<>();
    private String name;

    public FigurComposite(String name) {
        this.name = name;
    }

    public void add (FigurComponent figurComponent) {
        figurComponents.add(figurComponent);
    }

    public void remove (FigurComponent figurComponent) {
        figurComponents.remove(figurComponent);
    }

    public FigurComponent getChild (int i) {
        return figurComponents.get(i);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tegn () {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (FigurComponent figurComponent : figurComponents) {
            stringBuilder.append(figurComponent.getName()).append(",");
        }
        stringBuilder.append("];");
        System.out.println(stringBuilder);
    }

    public double getAreal () {
        double sum = 0;
        for (FigurComponent figurComponent : figurComponents) {
            sum += figurComponent.getAreal();
        }
        return sum;
    }

}
