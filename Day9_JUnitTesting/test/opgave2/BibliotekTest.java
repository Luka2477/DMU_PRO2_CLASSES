package opgave2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    private Bibliotek b;

    @BeforeEach
    void setUp() {
        b = new Bibliotek();
    }

    @Test
    void beregnBøde() {
        assertThrows(DateTimeException.class, () -> b.beregnBøde(LocalDate.of(2022, 3, 10), LocalDate.now(), true));
        assertThrows(DateTimeException.class, () -> b.beregnBøde(LocalDate.now(), LocalDate.now().plusDays(1), false));
        assertEquals(90, b.beregnBøde(LocalDate.of(2022,2,1), LocalDate.now(), true));
        assertEquals(30, b.beregnBøde(LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 10), false));
    }

}



