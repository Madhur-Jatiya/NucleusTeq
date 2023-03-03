package account;
public class Test {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(72897324L, "Madhur Jatiya", 9407192414L, "10/Nov/2001", 943435.34);
        System.out.println("Name : " + sa.getName());
        sa.closeAccount();
        sa.withDraw();
        sa.deposite();
        sa.fixedDeposite();
        System.out.println("=========================================");
        
        LoanAccount la = new LoanAccount(4223324L, "Lokesh Nargesh", 8827729125L, "25/July/2000", 143435.34);
        System.out.println("Name : " + la.getName());
        
        la.closeAccount();
        la.payEMI();
        la.repayment();
        la.topUpLoan();
    }
}
