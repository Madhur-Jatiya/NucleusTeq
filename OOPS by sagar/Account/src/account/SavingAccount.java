package account;

public class SavingAccount extends Account {

    public SavingAccount(long accountNumber, String name, long phoneNo, String dob, double balance) {
        super(accountNumber, name, phoneNo, dob, balance);
    }

    public void withDraw() {
        System.out.println("Cash WithDraw");
    }

    public void deposite() {
        System.out.println("Cash Diposite");
    }

    public void fixedDeposite() {
        System.out.println("Fixed Diposite");
    }
}
