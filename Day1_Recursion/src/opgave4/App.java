package opgave4;

public class App {

    // l = s.length()
    // td : reverse(s) = "", l = 0
    // rd : reverse(s) = reverse(s.substring(1))+s.charAt(0), l > 0
    public static String reverse (String s) {
        if (s.length() == 0) {
            return "";
        } else {
            return reverse(s.substring(1))+s.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse("Lukas Orluff Knudsen"));
    }

}
