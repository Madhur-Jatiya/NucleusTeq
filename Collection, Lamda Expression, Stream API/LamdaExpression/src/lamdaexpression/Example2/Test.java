package lamdaexpression.Example2;

public class Test {

    public static void main(String[] args) {
//        MyInter2 my = (3,6)-> System.out.println("Sum = " + );

        MyInter2 my2 = (int a, int b) -> {
            System.out.println(a + b);
        };

        my2.sum(5, 10);

//===================================================================================================
        MyInter2 my3 = (int a, int b)
                -> System.out.println(a + b);

        my3.sum(52, 18);

//===================================================================================================
        MyInter2 my4 = (a, b)
                -> System.out.println(a + b);

        my4.sum(34, 50);
    }
}
