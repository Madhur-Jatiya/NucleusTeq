package exceptions.CustomException.PasswordTest;

public class PasswordTest {

    public void test(String pswd) throws Exception {
        if (pswd.length() >= 8) {
            System.out.println("Strong Password");
        } else {
            throw new Exception("week password exception");
        }
    }
}
