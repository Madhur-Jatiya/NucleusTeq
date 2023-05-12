package lamdaexpression.Example1;

public class LamdaExpression {

    public static void main(String[] args) {
        
        MyInter my = new MyInter() {
            @Override
            public void a() {
                System.out.println("Hyy sir");
            }
        };
        
        my.a();
        
        MyInter my2 = () -> 
            System.out.println("How are you sir?");
            System.out.println("How are you sir 2?");
        
        my2.a();
        
        MyInter my3 = ()-> 
                System.out.println("Byy Sir");
        my3.a();
    }

}
