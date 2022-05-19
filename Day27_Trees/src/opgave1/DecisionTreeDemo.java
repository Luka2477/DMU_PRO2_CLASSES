package opgave1;

import java.util.Scanner;

/**
 * This program demonstrates a decision tree for an animal guessing game.
 */
public class DecisionTreeDemo {
    public static void main(String[] args) {

        BinaryTree<String> tiger = new BinaryTree<>("It ia a tiger.");
        BinaryTree<String> zebra = new BinaryTree<>("It is a zebra.");
        BinaryTree<String> canivore = new BinaryTree<>(
                "Is it a carnivore?", tiger, zebra);

        BinaryTree<String> pig = new BinaryTree<>("It is a pig.");
        BinaryTree<String> stripes = new BinaryTree<>(
                "Does it have stripes?", canivore, pig);

        BinaryTree<String> penguin = new BinaryTree<>("It is a penguin.");
        BinaryTree<String> ostrich = new BinaryTree<>("It is an ostrich.");
        BinaryTree<String> swim = new BinaryTree<>("Does it swim?",
                penguin, ostrich);

        BinaryTree<String> eagle = new BinaryTree<>("It is an eagle.");
        BinaryTree<String> fly = new BinaryTree<>("Does it fly?", eagle,
                swim);

        BinaryTree<String> questionTree = new BinaryTree<>(
                "Is it a mammal?", stripes, fly);

        // questionTree.inorder();
        boolean done = false;
        Scanner in = new Scanner(System.in);
        while (!done) {
            BinaryTree<String> left = questionTree.left();
            BinaryTree<String> right = questionTree.right();
            if (left.isEmpty() && right.isEmpty()) {
                System.out.println(questionTree.data());
                done = true;
            } else {
                String response;
                do {
                    System.out.print(questionTree.data() + " (Y/N) ");
                    response = in.next().toUpperCase();
                } while (!response.equals("Y") && !response.equals("N"));

                if (response.equals("Y")) {
                    questionTree = left;
                } else {
                    questionTree = right;
                }
            }
        }
        in.close();
    }
}
