package opgave2;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println(checkParantes("(3+{5{99{*}}[23[{67}67]]})"));
        System.out.println(checkParantes("(}){"));
        System.out.println(checkParantes("([{}]))"));
    }

    public static boolean checkParantes(String s) {
        ArrayListStack stack = new ArrayListStack();

        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);

            if (chr == '(' || chr == '[' || chr == '{') {
                stack.push(chr);
            } else if ((chr == ')' && !stack.pop().equals('(')) ||
                    (chr == ']' && !stack.pop().equals('[')) ||
                    (chr == '}' && !stack.pop().equals('{'))) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
