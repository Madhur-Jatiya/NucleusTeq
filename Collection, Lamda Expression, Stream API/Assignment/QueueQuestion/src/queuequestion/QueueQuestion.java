package queuequestion;

import java.util.*;

public class QueueQuestion {

    public static void main(String[] args) {
        while (true) {

            Queue<Integer> queue = new LinkedList();
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNumber of Inputs(non integer for exit) = ");
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
                int rev = sc.nextInt();
                sc.nextLine();

                System.out.println("\nBefore Reverse");
                System.out.println(queue);
                queue.clear();

                Stack<Integer> stack = new Stack<>();
                
                while (queue.equals(rev)) {                    
                    
                }

                System.out.println("\nAfter Reverse");
                System.out.println(queue);
            } catch (Exception e) {
                System.err.println("\n\t\tExit");
                return;
            }
        }
    }
}
