import java.util.HashMap;
import java.util.Scanner;
public class myown {
    public static class Student{
        private String name;
        private int age;
        public Student(String name, int age){
            this.name = name ;
            this.age = age;
        }
        public void showdetail(){
            System.out.print("name:" + name +","+ "age:" + age);
        }
        
        public void storage(){
            Scanner namescan = new Scanner(System.in);
            Scanner agescan = new Scanner(System.in);

        }
    }
    public static void createclass(){
        Scanner classscan = new Scanner(System.in);
        String classname = classscan.nextLine();
        HashMap<String, Student> classsname = new HashMap<>(); 
        classscan.close();
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        for(int i = 0; i < number; i++){
            Student student = Student.storage();
        }
    }
    public static void main(String[] args){
        
        createclass();
        
    }
}