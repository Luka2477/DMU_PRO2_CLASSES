package opgave2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bibliotek {

    public int beregnBøde (LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        if (!beregnetDato.isBefore(faktiskDato)) {
            throw new DateTimeException("Forventet afleveringsdato skal være før aktuel afleveringsdato.");
        }
        if (beregnetDato.isAfter(LocalDate.now())) {
            throw new DateTimeException("Forventet afleveringsdato skal være før/eller i dag.");
        }
        if (faktiskDato.isAfter(LocalDate.now())) {
            throw new DateTimeException("Aktuel afleveringsdato skal være før/eller i dag.");
        }

        long days = ChronoUnit.DAYS.between(beregnetDato, faktiskDato);
        int fine;
        if (0 < days && days < 8) {
            fine = 10;
        } else if (days < 15) {
            fine = 30;
        } else {
            fine = 45;
        }

        if (voksen) {
            fine *= 2;
        }

        return fine;
    }

}
