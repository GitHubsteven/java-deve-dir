package tree;

public class BiTree {
    private NewNode root;

    public BiTree(NewNode root) {
        this.root = root;
    }

    public NewNode findNode(int val) {
        NewNode curNode = root;
        System.out.println("compare the root");
        while (curNode.val != val) {
            if (val < curNode.val) {
                System.out.println("turn to the left");
                curNode = curNode.leftChild;
            } else {
                System.out.println("turn to the right");
                curNode = curNode.leftChild;
            }
        }
        return curNode;
    }

    /**
     * if(root == null)   root = node
     * curNode = root;
     * loop use key while
     * while(curNode != null)
     * {
     * if(node.val < curNode.val){
     * if(curNode.leftChild == null) curNode.leftChild = node;
     * if(curNode.leftChild.val < node.val) {
     * curNode.leftNode = tempNode;
     * curNode.leftNode  = node;
     * node.lefNode = tempNode;
     * return;
     * }else{
     * curNode = curNode.leftNode;
     * }
     * }
     * <p>
     * <p>
     * <p>
     * <p>
     * }
     *
     * @param node 插入的node
     */
    public void insertNode(NewNode node) {
        NewNode curNode = root;
        if (curNode == null) curNode = node;
        while (curNode != null) {

            if (curNode.leftChild != null) {

            }
        }
    }

    public void deleteNode(NewNode node) {

    }

    public void preOrderTraverse() {
    }

    public void midOrderTraverse() {
    }

    public void postOrderTraverse() {
    }
}
