import java.util.Scanner;
public class lab4e6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x;
        int sum = 0;
        for(int i = 0; i < n; i++){
            x = (int)(Math.random()*10+1);
            if (x % 2 == 0){
                sum += x;
                System.out.println(x);
            }
        }
        System.out.println(sum);
    }
}
