package exceptions.CustomException.VoterApp;

public class VoterRegistration extends Exception {

    public void apply(int age) throws Exception {
        if (age >= 18) {
            System.out.println("Applied Successfully");
        } else {
            throw new Exception("Under Age Exception");
        }
    }
}
