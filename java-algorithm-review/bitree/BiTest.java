package bitree;

import tree.BiTree;
import tree.NewNode;

public class BiTest {
    public static void main(String[] args) {
        NewNode root = new NewNode(20);
        BiTree tree = new BiTree(root);

        NewNode node1 = new NewNode(12);
        NewNode node2 = new NewNode(56);
        NewNode node3 = new NewNode(99);

        tree.insertNode(node1);
        tree.insertNode(node2);
        tree.insertNode(node3);

        NewNode node_56 = tree.findNode(node2.val);
        if (node_56 != null) {
            System.out.println(node_56);
        }
    }
}
