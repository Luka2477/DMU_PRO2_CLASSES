package opgave5;

public class App {

    // Big Oh: O(n)
    public static void belgisk_flag (char[] belgisk_flag) {
        int sIndex = 0, gIndex = 0, rIndex = 0;

        for (int i = 0; i < belgisk_flag.length; i++) {
            char farve = belgisk_flag[i];

            if (farve == 'S') {
                swap(belgisk_flag, i, sIndex++);
                if (i >= sIndex) swap(belgisk_flag, i, gIndex++);
                else gIndex++;
                if (i >= gIndex) swap(belgisk_flag, i, rIndex++);
                else rIndex++;
            } else if (farve == 'G') {
                swap(belgisk_flag, i, gIndex++);
                if (i >= gIndex) swap(belgisk_flag, i, rIndex++);
                else rIndex++;
            } else {
                swap(belgisk_flag, i, rIndex++);
            }
        }
    }

    public static void swap (char[] farver, int i1, int i2) {
        char temp = farver[i1];
        farver[i1] = farver[i2];
        farver[i2] = temp;
    }

    public static void main(String[] args) {
        char[] farver1 = {'G','R','S','G','G','R','S','R','G','G','R','S','G'};
        char[] farver2 = {'G','R','S','G','G','R','S','R','G','G','R','S','G','G','R','S','G','G','R','G','R','S','G','G','R','S','R','G','G','R','S','G','G','R','S','G','G','R'};

        System.out.println(farver1);
        belgisk_flag(farver1);
        System.out.println(farver1);

        System.out.println(farver2);
        belgisk_flag(farver2);
        System.out.println(farver2);
    }

}
