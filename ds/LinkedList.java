package ds;

public class LinkedList {
    Node head = null;
    Node tail = null;
    private int size = 0;

    class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    void add(int value) {
        Node n = new Node(value);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    void delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = get(index);
            temp.next = get(index + 2);
        }
        size--;
    }

    Node get(int index) {
        Node temp = head;
        if (temp == null) {
            return null;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    int getSize() {
        return size;
    }


}

