public class lab4e2{
    public static void main(String[] args){
        int i = 0;    
        int[] array = new int[20];
        while(i<20){
            int x =(int)(Math.random()*64 + 1);
            array[i] = x;
            i++;
        }
        int j = 0;
        while(j<20){
            System.out.print(array[j]+" ");
            j++;
        }
        
    }
}