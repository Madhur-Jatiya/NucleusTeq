import java.util.*;
public class SecondHighest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        
        for(int i = 0; i<x; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}