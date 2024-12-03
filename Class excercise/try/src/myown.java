public class myown{
    public static void main(String args[]){
      Runnable run = () ->System.out.println("yeah");
      Thread thread = new Thread(run);
      thread.start();

    }
}