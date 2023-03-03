import java.util.*;
import java.util.regex.*;
public class Validate
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main m = new Main();
        if(m.validate(num))
            System.out.println("Valid");
        else
        System.out.println("Not Valid");
	}
	
	public boolean validate(int num)
	{
	    return Pattern.matches("[0-9]{6}",Integer.toString(num));
	}
}
