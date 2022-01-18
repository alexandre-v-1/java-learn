package tests;

import binary.BinaryTree;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class binaryTree {
    @Test
    public void testBinaryTreeContainsAddingValue() {
        BinaryTree bt = new BinaryTree().createBinaryTree();
        // root value
        assertTrue(bt.containsNode(6));
        // left value
        assertTrue(bt.containsNode(3));
        // right value
        assertTrue(bt.containsNode(8));
        // none existing value
        assertFalse(bt.containsNode(12));
    }

    @Test
    public void testBinaryTreeValue() {
        BinaryTree bt = new BinaryTree().createBinaryTree();
        assertTrue(true);
    }
}
