package exceptions.CustomException.VoterApp;

public class Test {

    public static void main(String[] args) {
        VoterRegistration voterRegistration = new VoterRegistration();
        try {
            voterRegistration.apply(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
