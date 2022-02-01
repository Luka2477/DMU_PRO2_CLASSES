package opgave6;

import java.util.ArrayList;

public class App {

    public static int hanoiMoves (int n) {
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            source.add(i);
        }

        return hanoiMoves(n, source, new ArrayList<>(), new ArrayList<>());
    }

    public static int hanoiMoves (int n, ArrayList<Integer> source, ArrayList<Integer> target, ArrayList<Integer> auxiliary) {
        int moves = 0;

        if (n > 0) {
            moves += hanoiMoves(n-1, source, auxiliary, target);
            target.add(source.get(source.size()-1));
            source.remove(source.size()-1);
            moves++;
            System.out.println(source + "\n" + auxiliary + "\n" + target + "\n##################");
            moves += hanoiMoves(n-1, auxiliary, target, source);
        }

        return moves;
    }

    public static void main(String[] args) {
        System.out.println(hanoiMoves(20));
    }

}
