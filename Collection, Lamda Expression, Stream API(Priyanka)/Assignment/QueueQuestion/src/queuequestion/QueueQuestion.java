package queuequestion;

import java.util.*;

public class QueueQuestion {

    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size()) {
            System.out.println("Invalid value of k");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while (!stack.empty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNumber of Inputs = ");
        int input = 0;

        try {
            input = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < input; i++) {
                System.out.print("Enter integer = ");
                int value = sc.nextInt();
                sc.nextLine();
                queue.add(value);
            }

            System.out.print("How many number of integers you reverse = ");
            int k = sc.nextInt();
            sc.nextLine();

            System.out.println("\nBefore Reverse");
            System.out.println(queue);

            reverseFirstKElements(queue, k);

            System.out.println("\nAfter Reverse");
            System.out.println(queue);
        } catch (Exception e) {
            System.err.println("\n\t\tExit");
        }
    }
}
