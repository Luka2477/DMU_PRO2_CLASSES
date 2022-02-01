package opgave3;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static boolean contains (ArrayList<Integer> list, int tal) {
        return contains(list, tal, 0, list.size()-1);
    }

    private static boolean contains(ArrayList<Integer> list, int tal, int leftBound, int rightBound) {
        int middle = (leftBound + rightBound) / 2;
        int target = list.get(middle);

        if (leftBound == rightBound) {
            return false;
        } else if (target == tal) {
            return true;
        } else if (target > tal) {
            return contains(list, tal, leftBound, middle-1);
        } else {
            return contains(list, tal, middle+1, rightBound);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,10,15,16,17,20,25));
        System.out.println(contains(list, 6));
    }

}
