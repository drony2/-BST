import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int [] anArrayNodes = {
                17, 6, 5, 20, 19, 18, 11, 14, 12, 13, 2, 4, 10
        };

        for (int i = 0; i < anArrayNodes.length; i++) {
            tree.add(anArrayNodes[i]);
        }

        boolean isEmpty = tree.isEmpty(); //
        int size = tree.getSize(); //
        boolean contains = tree.containsNode(13); //

        System.out.println(isEmpty);
        System.out.println(size);
        System.out.println(contains);

    }
}