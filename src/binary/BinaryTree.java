package binary;

public class BinaryTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void addNode(int value) {
        root = addNodeRecursive(root, value);
    }

    public BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
        bt.addNode(6);
        bt.addNode(4);
        bt.addNode(8);
        bt.addNode(3);
        bt.addNode(5);
        bt.addNode(7);
        bt.addNode(9);
        bt.printBinaryTree(bt.root);

        return bt;
    }


    private void printBinaryTree(Node node) {
        if (node != null) {
            System.out.print("  " +node.value);
            printBinaryTree(node.left);
            printBinaryTree(node.right);
        }
    }

    private Node addNodeRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addNodeRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addNodeRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (current.value == value) {
            return true;
        }

        return value < current.value ? containsNodeRecursive(current.left, value) : containsNodeRecursive(current.right, value);
    }
}