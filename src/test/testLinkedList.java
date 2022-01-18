package test;

import binary.linkList;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testLinkedList {
    private linkList createLinkList() {
        linkList ll = new linkList();
        ll.addLink(1);
        ll.addLink(2);
        ll.addLink(3);
        ll.addLink(4);
        ll.addLink(5);
        ll.addLink(6);

        return ll;
    }

    @Test
    public void testContainsValueInLinkList() {
        linkList ll = createLinkList();

        assertTrue(ll.linkListContains(1));
        assertTrue(ll.linkListContains(2));
        assertTrue(ll.linkListContains(3));
        assertTrue(ll.linkListContains(4));
        assertTrue(ll.linkListContains(5));
        assertTrue(ll.linkListContains(6));
        assertFalse(ll.linkListContains(8));
    }

    @Test
    public void testMiddleOfLinkList() {
        linkList ll = createLinkList();
        assertEquals(ll.findMiddleOfLinkList(), 3);
    }

    @Test
    public void testRemoveLinkInList() {
        linkList ll = createLinkList();
        ll.deleteLink(1);
        assertFalse(ll.linkListContains(1));
        assertTrue(true);
    }
}
