public class Link_list {
    Node head;
    private int size;

    Link_list() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addList(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        size--;
        secondLast.next = null;
    }

    public void printList() {
        Node current = head;
        if (head == null)
            System.out.println("List is empty");
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        Link_list list = new Link_list();

        list.addFirst("S");
        list.addFirst("A");
        list.printList();

        list.addList("M");
        list.printList();

        list.addFirst("@");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.addList("F");
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println("Size:" + list.getSize());
    }
}
