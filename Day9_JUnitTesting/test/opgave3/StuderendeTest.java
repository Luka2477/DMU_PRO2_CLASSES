package opgave3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuderendeTest {

    private Studerende studerende;

    @BeforeEach
    void setup() {
        studerende = new Studerende(0, "Lukas");
    }

    @Test
    void setNavn() {
        assertEquals("Lukas", studerende.getNavn());
        studerende.setNavn("Mads");
        assertEquals("Mads", studerende.getNavn());
    }

    @Test
    void addKarakter() {
        assertEquals(0, studerende.getKarakterer().size());
        studerende.addKarakter(10);
        assertEquals(1, studerende.getKarakterer().size());
        studerende.addKarakter(12);
        assertEquals(12, studerende.getKarakterer().get(1));
    }

}