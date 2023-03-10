package exceptions.UncheckedExeption;

public class ArrayIndexOutOfTheBoxEx {

    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println(arr[9]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
