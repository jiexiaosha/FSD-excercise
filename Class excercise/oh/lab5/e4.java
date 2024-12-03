public class e4{
    public static int[] fivenum(){
        int[] numbers = new int[5];
        for(int i = 0;i<5;i++){
            int a = (int)(Math.random()*10+1);
            numbers[i] = a;
        }
        return numbers;
    }
    public static int facatorial(int number){
        int result = 1;
        for(int i = 1;i <=number;i++){
            result *= i;
        }
        return result;
    }
    public static int[] factorial(int[] random){
        int[] results = new int[random.length];
        for(int j = 0;j < random.length; j++){
            int number = random[j];
            int result = 1;
            for(int i = 1;i <=number;i++){
                result *= i;     
        }
        results[j] = result;
    }
        return results;
    }
    public static void showrand(int[] random){
        for(int i = 0; i < random.length; i ++){
            System.out.print(random[i]+",");
        }
    }   
    public static void showresult(int result){
        System.out.println(result);
    }
    public static void showresults(int[] results){
        for(int i = 0; i < results.length; i ++){
            System.out.print(results[i]+",");
        }
    }   
    public static void main(String[] args){
        int[] random = fivenum();
        int number = 10;
        int result = facatorial(number);
        int[] results = factorial(random);
        showrand(random);
        // showresult(result);
        showresults(results);
    }
}