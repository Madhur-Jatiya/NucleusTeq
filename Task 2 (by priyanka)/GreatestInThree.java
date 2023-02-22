import java.util.*;
public class GreatestInThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Number 3 : ");
        int n3 = sc.nextInt();
        System.out.println((n1>n2)?((n1>n3)?n1:n3):((n2>n3)?n2:n3));
    }
}