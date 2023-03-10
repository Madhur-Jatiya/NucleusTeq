package generic;

public class Test {

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<Integer>(12345);
        System.out.println(generic.getTemp());
    }
}
