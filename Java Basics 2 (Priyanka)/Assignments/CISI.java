import java.util.*;
public class CISI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P : ");
        double p = sc.nextDouble();
        System.out.print("Enter R : ");
        double r = sc.nextDouble();
        System.out.print("Enter T : ");
        double t = sc.nextDouble();
        
        double SI = (p*r*t)/100;
        System.out.println("Simple Interest = " + SI);
        
        double compound_interest = p * (Math.pow((1 + r / 100), t)) - p;
        System.out.println("Compound Interest = " + compound_interest);
    }
}