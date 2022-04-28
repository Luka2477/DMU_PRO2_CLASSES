package opgave4;

public class PostFixEvaluator {
    public int evaluate(String input) {
        final NodeStack stack = new NodeStack();

        for (String s : input.split(" ")) {
            if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
                if (stack.size() < 2) {
                    throw new RuntimeException("Invalid postfixudtryk.");
                }

                int op1 = (int) stack.pop();
                int op2 = (int) stack.pop();
                int res = switch (s) {
                    case "+" -> op1 + op2;
                    case "-" -> op2 - op1;
                    case "/" -> op2 / op1;
                    case "*" -> op1 * op2;
                    default -> 0;
                };

                stack.push(res);
            } else {
                try {
                    stack.push(Integer.parseInt(s));
                } catch (NumberFormatException ex) {
                    throw new RuntimeException("Invalid postfixudtryk.");
                }
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Invalid postfixudtryk.");
        }

        return (int) stack.pop();
    }
}
