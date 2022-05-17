package opgave2;

import java.util.Objects;

public class Bil {
    private String regNum;
    private String make;
    private String model;
    private String color;

    public Bil(String regNum, String make, String model, String color) {
        this.regNum = regNum;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNum='" + regNum + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return regNum.equals(bil.regNum) && make.equals(bil.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNum, make);
    }
}
