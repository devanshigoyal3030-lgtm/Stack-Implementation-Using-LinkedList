
public class StackMain {

    public static void main(String[] args) {

        Stack s = new Stack();

        // Insert elements
        s.push(10);
        s.push(20);
        s.push(30);

        // Display stack
        System.out.println("\nStack Elements:");
        s.display();

        // Peek operation
        System.out.println("\nTop Element: " + s.peek());

        // Pop operation
        System.out.println("\nRemoving Element:");
        s.pop();

        // Display after pop
        System.out.println("\nAfter Pop:");
        s.display();

        // Size operation
        System.out.println("\nStack Size: " + s.size());

        // Check empty
        System.out.println("Is Stack Empty? " + s.isEmpty());

        // Remove remaining elements
        s.pop();
        s.pop();

        // Check empty again
        System.out.println("\nIs Stack Empty? " + s.isEmpty());

        // Underflow condition
        System.out.println("\nTrying to Pop Empty Stack:");
        s.pop();
    }
}
