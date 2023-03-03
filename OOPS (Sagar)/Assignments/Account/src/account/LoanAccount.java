package account;

public class LoanAccount extends Account {

    public LoanAccount(long accountNumber, String name, long phoneNo, String dob, double balance) {
        super(accountNumber, name, phoneNo, dob, balance);
    }

    public void payEMI() {
        System.out.println("Pay EMI");
    }

    public void topUpLoan() {
        System.out.println("Top Up Loan");
    }

    public void repayment() {
        System.out.println("Re-Payment");
    }
}
