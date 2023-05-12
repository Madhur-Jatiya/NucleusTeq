package lamdaexpression.Example3;

public class Test2 {

    public static void main(String[] args) {
        MyInter3 my = (a) -> 
            System.out.println(a);
//            System.out.println(a);

        my.show(10);

    }
}
