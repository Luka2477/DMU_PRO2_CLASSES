package opgave2;

import java.util.ArrayList;

public class ArrayListStack implements StackI {
    private final ArrayList<Object> stack;

    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(Object element) {
        stack.add(element);
    }

    @Override
    public Object pop() {
        if (stack.isEmpty()) {
            return new Object();
        }

        Object temp = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return temp;
    }

    @Override
    public Object peek() {
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}
