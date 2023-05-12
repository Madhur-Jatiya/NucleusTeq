package exceptions.UncheckedExeption;

public class ArithmeticException {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
