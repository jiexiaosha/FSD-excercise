import java.util.Scanner;
public class e3 {
    public static String read(){
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        in.close();
        return sentence;
    }
    public static int countvow(String array){
        int num = 0;
        for(int i = 0; i < array.length(); i++ ){
            char c = array.charAt(i);
            if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
                num++;
            }
        }
        return num;
    }
    public static void show(int num){
        System.out.println(num);
    }
    public  static void main(String[] args){
        String x = read();
        int num = countvow(x);
        show(num);
    }
}
