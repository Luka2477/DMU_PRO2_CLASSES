package opgave2;

public class App {

    public static boolean palindrom (String tekst) {
        if (tekst.length() <= 1) {
            return true;
        } else if (tekst.charAt(0) != tekst.charAt(tekst.length()-1)) {
            return false;
        } else {
            return palindrom(subString(tekst, 1, tekst.length()-1));
        }
    }

    private static String subString (String tekst, int startIndex, int endIndex) {
        StringBuilder builder = new StringBuilder();

        for (int i = startIndex; i < endIndex; i++) {
            builder.append(tekst.charAt(i));
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(palindrom("ABCDEFGGFEDCBA"));
    }

}
