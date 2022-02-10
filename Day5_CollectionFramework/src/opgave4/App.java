package opgave4;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();

        File file = new File("day5_collectionframework/textfiler/film.txt");
        try (Scanner scanner = new Scanner(file)) {
            int count = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < count; i++) {
                String key = scanner.nextLine();
                int karakter = Integer.parseInt(scanner.nextLine());

                if (map.putIfAbsent(key, new LinkedList<>(List.of(karakter))) != null) {
                    map.get(key).add(karakter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String key : map.keySet()) {
            List<Integer> value = map.get(key);
            int count = value.size();
            double average = value.stream().mapToDouble(m->m).sum() / count;

            System.out.printf("%35s: %2d karakterer, gennemsnit %1.2f%n", key, count, average);
        }
    }

}