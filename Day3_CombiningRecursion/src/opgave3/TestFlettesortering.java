package opgave3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFlettesortering {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(56);
        list.add(37);
        list.add(48);
        list.add(12);
        list.add(34);
        list.add(4);
        list.add(56);
        System.out.println(list);
        
        FletteSorteringHul sort = new FletteSorteringHul();
        sort.fletteSort(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8, 56, 45, 34, 15, 12, 34, 44));
        System.out.println(list2);

        sort.fletteSort(list2);
        System.out.println(list2);
    }
    
}
