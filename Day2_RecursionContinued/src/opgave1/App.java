package opgave1;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static int ligeTal (ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        } else {
            return (list.get(0) % 2 == 0 ? 1 : 0) +
                    ligeTal(subList(list, 1));
        }
    }

    private static ArrayList<Integer> subList (ArrayList<Integer> list, int startIndex) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = startIndex; i < list.size(); i++) {
            result.add(list.get(i));
        }

        return result;
    }

    public static int ligeTal2 (ArrayList<Integer> list) {
        return ligeTal2(list, 0);
    }

    private static int ligeTal2 (ArrayList<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        } else {
            return (list.get(index)%2 == 0 ? 1 : 0) +
                    ligeTal2(list, ++index);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(ligeTal(list));
        System.out.println(ligeTal2(list));
    }

}
