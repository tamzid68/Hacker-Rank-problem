public class Link_list2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
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

    public void fined(int data) {
        Node current = head;
        while (current.next != null) {
            if (current.data == data)
                System.out.println("Data found");
            current = current.next;
        }
        System.out.println("Data not found");
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

    public static void main(String[] args) {
        Link_list2 list = new Link_list2();

        list.addFirst(5);//1, 5, 7, 3 , 8, 2, 3
        list.addFirst(1);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        list.fined(10);
    }
}
