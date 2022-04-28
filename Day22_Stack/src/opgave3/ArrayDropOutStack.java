package opgave3;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements StackI {
    private Object[] stack;
    private int top;
    private final int MAX_CAP;

    public ArrayDropOutStack(int maxCap) {
        top = -1;
        stack = new Object[maxCap];
        MAX_CAP = maxCap;
    }

    @Override
    public void push(Object element) {
        if (size() == MAX_CAP) {
            shiftLeft();
            top--;
        }

        top++;
        stack[top] = element;
    }

    private void shiftLeft() {
        for (int i = 1; i < size(); i++) {
            stack[i - 1] = stack[i];
        }
        stack[top] = null;
    }

    @Override
    public Object pop() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    @Override
    public Object peek() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    public void print() {
        StringBuilder sb = new StringBuilder(stack[0].toString());
        for (int i = 1; i < size(); i++) {
            sb.append(", ").append(stack[i].toString());
        }
        System.out.println(sb);
    }
}
