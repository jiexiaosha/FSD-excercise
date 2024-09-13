package oh.lab6;
import java.util.Scanner;


public class e1 {
    public class Person{

        private String name;
        private int age;

        public Person(){
            this.name = name;
            this.age = age;
        } 
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        } 


        public void personinitial(){
            Scanner nag = new Scanner(System.in);
            System.out.println("Please entere the name:");
            this.name = nag.nextLine();
            System.out.println("Please entere the age:");
            this.age = nag.nextInt();
        }
        public void show(){
            System.out.println(this.name + " age is " + this.age + " years old");
        }
        public void update(){
            Scanner input = new Scanner(System.in);
            System.out.println("do you wanna change your name?(yes/no)");
            String newname = input.nextLine();
            if (newname.equals("yes")){
                System.out.println("please enter your name");
                this.name = input.nextLine();
            }
            System.out.println("do you wanna change your age?(yes/no)");
            String newage = input.nextLine();
            if (newage.equals("yes")){
                System.out.println("please enter your age:");
                this.age = input.nextInt();
            }

        }
    }


    public static void main(String args[]){
        e1 outer = new e1();
        Person person1 = outer.new Person();
        // person1.personinitial();
        // person1.show();
        Person person2 = outer.new Person("Xiaorui Liu", 23);
        person2.show();
        person2.update();
        person2.show();
        
    }
}
