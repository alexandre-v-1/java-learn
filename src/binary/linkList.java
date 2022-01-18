package binary;

public class linkList {
    cell root;

    class cell {
        int value;
        cell next;

        cell(int value) {
            this.value = value;
            this.next = null;
        }
    }


    public void addLink(int value) {
        root = addLinkRecursive(root, value);
    }

    private cell addLinkRecursive(cell link, int value) {
        if (link == null) {
            return new cell(value);
        }

        link.next = addLinkRecursive(link.next, value);
        return link;
    }

    private void printLinkList(cell element) {
        if (element != null) {
            System.out.print(" "+ element.value);
            printLinkList(element.next);
        }
    }

    public int findMiddleOfLinkList() {
        int i = 0;
        return browseLinkRecursive(root, i) / 2;
    }

    private int browseLinkRecursive(cell element, int count) {
       if (element != null) {
           count++;
           count = browseLinkRecursive(element.next, count);
       }

        return count;
    }

    public void deleteLink(int value) {
        root = deleteLinkRecursive(root, value);
    }

    private cell deleteLinkRecursive(cell element, int value) {
        if (element == null) {
            return null;
        }

        if (element.value == value) {
            if (element.next == null) {
                return null;
            }

            return element.next;
        }

        element.next = deleteLinkRecursive(element.next, value);

        return element;
    }
    public boolean linkListContains(int value) {
        return linkListContainsValueRecursive(root, value);
    }

    private boolean linkListContainsValueRecursive(cell element, int value) {
        if (element == null) {
            return false;
        }

        if (element.value == value) {
            return true;
        }

        return linkListContainsValueRecursive(element.next, value);
    }
}
