package opgave3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkoleTest {

    private Skole skole;

    @BeforeEach
    void setup() {
        skole = new Skole("EAAA");
    }

    @Test
    void addStuderende() {
        Studerende lukas = new Studerende(1, "Lukas");

        assertEquals(0, skole.getStuderende().size());
        skole.addStuderende(lukas);
        assertEquals(1, skole.getStuderende().size());
        skole.addStuderende(lukas);
        assertEquals(1, skole.getStuderende().size());
    }

    @Test
    void removeStuderende() {
        Studerende lukas = new Studerende(1, "Lukas");

        skole.addStuderende(lukas);
        assertEquals(1, skole.getStuderende().size());
        skole.removeStuderende(lukas);
        assertEquals(0, skole.getStuderende().size());
    }

    @Test
    void gennemsnit() {
        Studerende lukas = new Studerende(1, "Lukas");
        lukas.addKarakter(12);
        lukas.addKarakter(7);
        lukas.addKarakter(5);
        skole.addStuderende(lukas);
        assertEquals(8.0, skole.gennemsnit());

        Studerende mads = new Studerende(2, "Mads");
        mads.addKarakter(4);
        mads.addKarakter(7);
        mads.addKarakter(2);
        skole.addStuderende(mads);
        assertEquals(6.16, skole.gennemsnit(), 0.01);
    }

    @Test
    void findStuderende() {
        Studerende lukas = new Studerende(1, "Lukas");
        Studerende mads = new Studerende(10, "Mads");
        skole.addStuderende(lukas);
        skole.addStuderende(mads);

        assertEquals(lukas, skole.findStuderende(1));
        assertEquals(mads, skole.findStuderende(10));
        assertNull(skole.findStuderende(0));
    }
}