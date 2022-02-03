package opgave1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static int sum (ArrayList<Integer> list) {
        return sum(list, 0, list.size()-1);
    }

    public static int sum (ArrayList<Integer> list, int leftBound, int rightBound) {
        if (leftBound == rightBound) {
            return list.get(leftBound);
        } else {
            int middle = (leftBound + rightBound) / 2;
            return sum(list, leftBound, middle) + sum(list, middle+1, rightBound);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,12,23,346,56,2,1));
        System.out.println(sum(list));
        System.out.println(list.stream().mapToInt(a -> a).sum());
    }

}
