
class Stack {

    Node top;
    int count;

    // Constructor
    Stack() {
        top = null;
        count = 0;
    }

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        count++;

        System.out.println(data + " inserted");
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;

        top = top.next;
        count--;

        System.out.println(value + " removed");

        return value;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Check empty
    boolean isEmpty() {
        return top == null;
    }

    // Find size
    int size() {
        return count;
    }

    // Display stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}
