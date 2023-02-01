package ds;

public class DoublyLinkedList {
    Node head = null;
    private int size = 0;
    Node tail = null;
    class Node {
        int value;
        Node previous = null;
        Node next = null;
        Node(int value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
    void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        size++;
    }
    void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = get(index);
            temp.next = get(index + 2);
            temp.next.previous = temp;
        }
        size--;
    }

    private Node get(int index) {
        Node temp = head;
        if (temp == null) {
            return null;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <- -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    int getSize() {
        return size;
    }

}
