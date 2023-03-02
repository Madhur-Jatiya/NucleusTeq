package account;

public class Account {

    private long accountNumber;
    private String name;
    private long phoneNo;
    private String dob;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(long accountNumber, String name, long phoneNo, String dob, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void closeAccount() {
        System.out.println("Close Account");
    }
}
