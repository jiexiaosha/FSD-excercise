import java.util.Scanner;
public class lab4e7 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine(); 
        int upper = 0;
        int lower = 0;
        for(int i = 0; i <word.length();i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                upper ++;
            }
            if(Character.isLowerCase(c)){
                lower ++;
            }
        }
        System.err.println(word.length());
        System.out.println(upper);
        System.out.println(lower);
        in.close();
    }
    
}
