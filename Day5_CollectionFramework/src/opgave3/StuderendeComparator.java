package opgave3;

import java.util.Comparator;

public class StuderendeComparator implements Comparator<Studerende> {

    @Override
    public int compare(Studerende s1, Studerende s2) {
        return s1.getNavn().compareTo(s2.getNavn());
    }

}
