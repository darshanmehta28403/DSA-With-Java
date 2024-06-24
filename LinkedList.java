public class LinkedList {

    Node first;

    class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
            this.next = null;
        }

        Node() {
        }
    }

    void addFirst(String data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    void addLast(String data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node currentNode = first;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    void printList() {
        if (first == null) {
            System.out.println("No List Found");
        } else {
            Node currentNode = first;
            while (currentNode != null) {
                System.out.print(currentNode.value + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }
    }

    void deleteNode(int index) {
        if (first == null) {
            System.out.println("No List Found");
        } else {
            if (index == 1) {
                first = first.next;
            } else {
                int count = 1;
                Node currentNode = first;
                while (currentNode.next != null) {
                    if (count == index - 1) {
                        currentNode.next = currentNode.next.next;
                        break;
                    }
                    currentNode = currentNode.next;
                    count++;
                }
            }
        }
    }

    void copyList() {
        if (first == null) {
            System.out.println("No List to Copy");
        } else {
            LinkedList newList = new LinkedList();
            Node currentNode = first;
            while (currentNode != null) {
                newList.addLast(currentNode.value);
                currentNode = currentNode.next;
            }
            System.out.print("Copied List: ");
            newList.printList();
        }
    }

    boolean search(String key) {
        if (first == null) {
            return false;
        } else {
            Node currentNode = first;
            while (currentNode != null) {
                if (currentNode.value.equals(key)) {
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }
    }

    void reverse() {
        if (first == null || first.next == null) {
            return; // No need to reverse if empty or only one node
        }
        Node prev = null;
        Node current = first;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst("a");
        l1.addLast("b");
        l1.addLast("c");
        l1.addFirst("1");

        System.out.println("Original List:");
        l1.printList();

        System.out.println("\nSearching for 'b': " + l1.search("b"));
        System.out.println("Searching for 'd': " + l1.search("d"));

        l1.reverse();
        System.out.println("\nReversed List:");
        l1.printList();

        l1.deleteNode(4);
        System.out.println("\nList after deleting node at index 4:");
        l1.printList();

        System.out.println("\nCopying the list:");
        l1.copyList();
    }
}
