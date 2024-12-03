package oh.lab7;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e1 {
    


    static class Student implements Serializable{
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
        private String number;


        public Student(String name, int age, String number){
            this.name = name;
            this.age = age;
            this.number = number;
        }
        public String getname(){
            return name;
        }
        public int getage(){
            return age;
        }
        public String getnumber(){
            return number;
        }
        public String show(){
            return name+","+age+","+number;
        }
    }



        @SuppressWarnings("unchecked")
        private static void loadFromFile(Map<String, Student> studentMap) throws IOException, ClassNotFoundException{
        File file = new File(stu_path);
        if(!file.exists()){
            file.createNewFile();
            System.out.println("NEW FILE HAS BEEN CREATED");
            return;
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(stu_path))){
            studentMap.putAll((Map<String, Student>) ois.readObject());
            System.out.println("READING FILE...");
        }catch(EOFException e){
            System.out.println("NO DATA!");
        }


    }



        private static void saveToFile(Map<String, Student> studentMap) throws IOException {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(stu_path))) {
                oos.writeObject(studentMap);  // 序列化 Map 对象
                System.out.println("学生信息已保存到文件。\n");
            }
        }



    private static final String stu_path = "E:\\javacode\\oh\\lab7\\students.data";



    public static void main(String args[]) throws ClassNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        Map <String, Student> studentMap = new HashMap<>();
        loadFromFile(studentMap);

        while(true){
            System.out.println("PLEASE ENTER THE NUMBER OF A STUDENT OR ENTER 'exit' TO LEAVE:");
            String number = scanner.nextLine();
            if(number.equalsIgnoreCase("exit")){
                break;
            }
            System.out.println("PLEASE ENTER THE NAME:");
            String name = scanner.nextLine();
            
            System.out.println("PLEASE ENTER THE AGE:");
            int age = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(name, age, number);
            studentMap.put(student.getnumber(), student);
            System.out.println("ADD A NEW STUDENT DATA");

        }
        saveToFile(studentMap);
    }
}
