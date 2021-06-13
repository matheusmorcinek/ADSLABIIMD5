package desafio;

import static java.lang.System.exit;

class Stack {

    private class node {

        int data;
        node link;
    }

    node top;

    Stack() {

        this.top = null;
    }

    public void push(int x) {
        node temp = new node();

        if (temp == null) {

            return;
        }

        temp.data = x;
        temp.link = top;

        top = temp;
    }

    public boolean isempty() {

        return top == null;
    }

    public int peek() {

        if (!isempty()) {

            return top.data;
        } else {

            return -1;
        }
    }

    public void pop() {

        if (top == null) {

            return;
        }

        top = (top).link;
    }

    public void display() {

        if (top == null) {

            exit(1);
        } else {

            node temp = top;
            while (temp != null) {

                temp = temp.link;
            }
        }
    }
}

public class LinkedStack {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();

        System.out.printf("\ntop é %d\n", stack.peek());

        stack.pop();
        stack.pop();
     
        stack.display();

        System.out.printf("\ntop é %d\n", stack.peek());

    }

}