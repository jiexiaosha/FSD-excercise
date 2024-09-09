public class e2 {
    public static int[] twenval(){
        int[] array =new int[20];
        int i = 0;
        while(i < 20){
            int a = (int)(Math.random()*100 + 1);
            array[i] = a;
            i++;
        }
        return array;
    }
    public static void showarr(int[] array){
        for(int i = 0; i < array.length; i ++){
            System.out.print(array[i]+",");
        }
    }
    public static void main(String[] args){
        int[] x = twenval();
        showarr(x);
    }
    
}
