class GoodMorningRunnable implements Runnable {
    public void run(){
        try{ for(int i=0;i<5;i++){ System.out.println("Good Morning"); Thread.sleep(1000);} }catch(Exception e){}
    }
}
class HelloRunnable implements Runnable {
    public void run(){
        try{ for(int i=0;i<5;i++){ System.out.println("Hello"); Thread.sleep(2000);} }catch(Exception e){}
    }
}
class WelcomeRunnable implements Runnable {
    public void run(){
        try{ for(int i=0;i<5;i++){ System.out.println("Welcome"); Thread.sleep(3000);} }catch(Exception e){}
    }
}
public class RunnableExample {
    public static void main(String[] args){
        new Thread(new GoodMorningRunnable()).start();
        new Thread(new HelloRunnable()).start();
        new Thread(new WelcomeRunnable()).start();
    }
}
