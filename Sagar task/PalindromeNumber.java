public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 1; i < num; i++)
        {
          System.out.print(i + " ");  
        }
        
        for(int i = num-2; i > 0; i--)
        {
          System.out.print(i + " ");  
        }
    }
}