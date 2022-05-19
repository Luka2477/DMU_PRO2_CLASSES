package opgave2;

public class App {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>(45);
        tree.insert(22)
                .insert(77)
                .insert(11)
                .insert(15)
                .insert(30)
                .insert(25)
                .insert(90)
                .insert(88);

        System.out.println("Size: " + tree.size());
        System.out.println("Height: " + tree.height());

        // 3.)
        // preorder  : 45 22 11 15 30 25 77 90 88
        // inorder   : 11 15 22 25 30 45 77 88 90
        // postorder : 15 11 25 30 22 88 90 77 45

        System.out.print("Preorder:  ");
        tree.printPreorder();
        System.out.print("Inorder:   ");
        tree.printInorder();
        System.out.print("Postorder: ");
        tree.printPostorder();
    }
}
