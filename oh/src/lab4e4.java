import java.util.Scanner;
import java.util.Arrays;

public class lab4e4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0;i < n; i++){
            Scanner nume = new Scanner(System.in);
            int num = nume.nextInt(); 
            array[i] = num;
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println(min);
        System.out.println(max);
    }
    
}
