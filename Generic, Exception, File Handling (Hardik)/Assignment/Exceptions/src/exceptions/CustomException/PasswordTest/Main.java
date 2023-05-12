package exceptions.CustomException.PasswordTest;

public class Main {

    public static void main(String[] args) {
        PasswordTest passwordTest = new PasswordTest();
        try {
            passwordTest.test("ndhj2ja5");
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.getMessage());
        }
    }
}
