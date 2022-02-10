package opgave3;

public class Test {

    public static void main(String[] args) {
        Skole skole = new Skole("EAAA");
        skole.addStuderende(new Studerende(1, "Lukas"));
        skole.addStuderende(new Studerende(2, "Mads"));
        skole.addStuderende(new Studerende(3, "Oliver"));
        skole.addStuderende(new Studerende(4, "Rikke"));
        skole.addStuderende(new Studerende(5, "Morten"));
        skole.addStuderende(new Studerende(6, "Lasse"));
        skole.addStuderende(new Studerende(7, "Jeppe"));

        System.out.println(skole.getStuderende());
    }

}
