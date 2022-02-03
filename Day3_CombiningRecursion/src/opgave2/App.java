package opgave2;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static int nuller (ArrayList<Integer> list) {
        return nuller(list, 0, list.size()-1);
    }

    public static int nuller (ArrayList<Integer> list, int leftBound, int rightBound) {
        if (leftBound == rightBound) {
            return list.get(leftBound) == 0 ? 1 : 0;
        } else {
            int middle = (leftBound + rightBound) / 2;
            return nuller(list, leftBound, middle) + nuller(list, middle+1, rightBound);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,0,10,0,0));
        System.out.println(nuller(list));
    }

}
