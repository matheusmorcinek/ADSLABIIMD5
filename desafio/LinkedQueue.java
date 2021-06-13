package desafio;

import java.util.*;

class Queue {

    class Node {

        public int data;
        public Node next;
    }

    private Node first;

    public Queue() {

        first = null;
    }

    public void insertFirst(int x) {

        Node n = new Node();
        n.data = x;
        n.next = first;
        first = n;
    }

    public void enqueue(int x) {

        if (first == null) {

            insertFirst(x);
        } else {

            Node n = new Node();
            n.data = x;
            Node temp = first;
            while (temp.next != null)
                temp = temp.next;
            n.next = temp.next;
            temp.next = n;
        }
    }

    public int dequeue() {

        if (first == null) {

            throw new NoSuchElementException();
        } else {

            int ret = first.data;
            first = first.next;
            return ret;
        }
    }

    public int peek() {

        if (first == null) {

            throw new NoSuchElementException();
        } else {

            return first.data;
        }
    }
}

public class LinkedQueue {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.print("Primeiro: " + queue.peek());

        System.out.print("\nprimeiro dequeue: " + queue.dequeue() + "\nsegundo dequeue: " + queue.dequeue()
                + "\nterceiro dequeue: " + queue.dequeue());
    }
}