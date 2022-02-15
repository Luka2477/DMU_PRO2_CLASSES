package opgave5;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        // Opgave 5.a
        TreeSet<String> set = findAllWords("day6_lambdaexpressions/textfiler/ord.txt");
        System.out.println("Unique word count: " + set.size());
        System.out.println(set);
        System.out.println();

        // Opgave 5.b
        TreeMap<String, Integer> map = findAllWordsMap("day6_lambdaexpressions/textfiler/ord.txt");
        map.forEach((k, v) -> System.out.print("("+k+", "+v+"), "));
        System.out.println("\n");

        // Opgave 5.c
        Stream<Map.Entry<String, Integer>> sortedMap = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        sortedMap.forEach(s -> System.out.print("("+s+"), "));
    }

    // Opgave 5.a
    public static TreeSet<String> findAllWords (String filename) {
        TreeSet<String> set = new TreeSet<>();
        File file = new File(filename);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                set.add(scanner.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return set;
    }

    // Opgave 5.b
    public static TreeMap<String, Integer> findAllWordsMap (String filename) {
        TreeMap<String, Integer> map = new TreeMap<>();
        File file = new File(filename);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String next = scanner.next().toLowerCase().replaceAll("[0123456789 ,.!?'`´;:\"-]+", "");

                if (map.putIfAbsent(next, 1) != null) {
                    map.put(next, map.get(next)+1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

}
