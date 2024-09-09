import java.util.Scanner;

public class lab4e5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1;
        for(int i = 1; i < n; i++){
            if (i%2 == 0){
                num += i;
            }
        }
        System.out.println(num);
    }
    
}
