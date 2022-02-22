package opgave1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BilForsikringTest {

    private BilForsikring bf;

    @BeforeEach
    void setUp() {
        bf = new BilForsikring();
    }

    @Test
    void beregnPraemie() {
        bf.setGrundpaemie(12);
        assertEquals(12, bf.getGrundPraemie());
        assertThrows(RuntimeException.class, () -> bf.beregnPraemie(10, false, 1));

        assertEquals(12.75, bf.beregnPraemie(21, false, 3));
        assertEquals(7.41, bf.beregnPraemie(45, true, 15), 0.001);
    }

}