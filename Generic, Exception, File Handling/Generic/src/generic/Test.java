package generic;

public class Test {

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<Integer>(12345);
        System.out.println(generic.getTemp());

        Generic<String> generic2 = new Generic<String>("Madhur");
        System.out.println(generic2.getTemp());

        Generic<Character> generic3 = new Generic<Character>('A');
        System.out.println(generic3.getTemp());

        Generic<Double> generic4 = new Generic<Double>(345.225);
        System.out.println(generic4.getTemp());

        Generic<Boolean> generic5 = new Generic<Boolean>(true);
        System.out.println(generic5.getTemp());
    }
}
