
public class StackChallenges {

    // 1. Reverse a String
    static String reverseString(String str) {

        Stack s = new Stack();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String result = "";

        while (!s.isEmpty()) {
            result = result + (char) s.pop();
        }

        return result;
    }

    // 2. Check Palindrome
    static boolean isPalindrome(String str) {

        Stack s = new Stack();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        String reverse = "";

        while (!s.isEmpty()) {
            reverse = reverse + (char) s.pop();
        }

        return str.equalsIgnoreCase(reverse);
    }

    // 3. Reverse Stack using Another Stack
    static Stack reverseStack(Stack original) {

        Stack second = new Stack();

        while (!original.isEmpty()) {
            second.push(original.pop());
        }

        return second;
    }

    // 4. Find Middle Element
    static int findMiddle(Stack s) {

        if (s.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        Node slow = s.top;
        Node fast = s.top;

        while (fast != null &&
                fast.next != null &&
                fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        // Challenge 1
        System.out.println("Reverse String: "
                + reverseString("HELLO"));

        // Challenge 2
        System.out.println("Palindrome: "
                + isPalindrome("MADAM"));

        // Create stack
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        // Challenge 3
        System.out.println("\nOriginal Stack:");
        s.display();

        Stack reversed = reverseStack(s);

        System.out.println("Reversed Stack:");
        reversed.display();

        // Challenge 4
        System.out.println("Middle Element: "
                + findMiddle(reversed));
    }
}
