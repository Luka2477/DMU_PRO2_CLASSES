package opgave3;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E extends Comparable<E>> {
    private Node root;

    /**
     * Constructs an empty tree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Constructs a tree with one node and no children.
     *
     * @param rootData the data for the root
     */
    public BinaryTree(E rootData) {
        root = new Node();
        root.data = rootData;
        root.left = null;
        root.right = null;
    }

    /**
     * Constructs a binary tree.
     *
     * @param rootData the data for the root
     * @param left     the left subtree
     * @param right    the right subtree
     */
    public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
        root = new Node();
        root.data = rootData;
        if (left != null) {
            root.left = left.root;
        }
        if (right != null) {
            root.right = right.root;
        }
    }

    public BinaryTree<E> insert(E rootData) {
        insert(rootData, root);
        return this;
    }

    private BinaryTree<E> insert(E rootData, Node n) {
        if (n.data.compareTo(rootData) == 0) {
            return null;
        } else if (n.data.compareTo(rootData) < 0) {
            return (n.right != null) ? insert(rootData, n.right) : insert(n, rootData);
        } else {
            return (n.left != null) ? insert(rootData, n.left) : insert(n, rootData);
        }
    }

    private BinaryTree<E> insert(Node n, E rootData) {
        BinaryTree<E> ret = new BinaryTree<>(rootData);
        if (n.data.compareTo(rootData) < 0) {
            n.right = ret.root;
        } else {
            n.left = ret.root;
        }
        return ret;
    }

    /**
     * Checks whether this tree is empty.
     *
     * @return true if this tree is empty
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Gets the data at the root of this tree.
     *
     * @return the root data
     */
    public E data() {
        return root.data;
    }

    /**
     * Gets the left subtree of this tree.
     *
     * @return the left child of the root
     */
    public BinaryTree<E> left() {
        BinaryTree<E> result = new BinaryTree<>();
        result.root = root.left;
        return result;
    }

    /**
     * Gets the right subtree of this tree.
     *
     * @return the right child of the root
     */
    public BinaryTree<E> right() {
        BinaryTree<E> result = new BinaryTree<>();
        result.root = root.right;
        return result;
    }

    /**
     * @param rootData the new data for the root
     * @return the data previous in the root
     */
    public E replace(E rootData) {
        E temp = root.data;
        root.data = rootData;
        return temp;
    }

    /**
     * @param n
     * @return true in n has no children
     */
    private boolean isLeaf(Node n) {
        return n.left == null && n.right == null;
    }

    /**
     * @param n
     * @return true in n has at least one child
     */
    private boolean isInternal(Node n) {
        return n.left != null || n.right != null;
    }

    /**
     * @return the number of nodes in the tree
     */
    public int size() {
        return size(root);
    }

    private int size(Node n) {
        if (n == null) {
            return 0;
        } else {
            return size(n.left) + size(n.right) + 1;
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node n) {
        if (n == null) {
            return 0;
        } else {
            int left = height(n.left);
            int right = height(n.right);
            return Math.max(left, right) + 1;
        }
    }

    public void printPreorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node n) {
        if (n != null) {
            System.out.print(n.data + " ");
            preorder(n.left);
            preorder(n.right);
        }
    }

    public void printInorder() {
        inorder(root);
        System.out.println();
    }

    public void inorder(Node n) {
        if (n != null) {
            inorder(n.left);
            System.out.print(n.data + " ");
            inorder(n.right);
        }
    }

    public void printPostorder() {
        postorder(root);
        System.out.println();
    }

    public void postorder(Node n) {
        if (n != null) {
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.data + " ");
        }
    }

    public int sum() {
        if (!(root.data instanceof Integer)) return 0;
        return sum(root);
    }

    private int sum(Node n) {
        if (n == null) {
            return 0;
        } else {
            return sum(n.left) + sum(n.right) + (Integer) n.data;
        }
    }

    private class Node {
        public E data;
        public Node left;
        public Node right;
    }
}
