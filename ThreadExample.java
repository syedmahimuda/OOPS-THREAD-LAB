class GoodMorningThread extends Thread {
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }catch(Exception e){}
    }
}
class HelloThread extends Thread {
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        }catch(Exception e){}
    }
}
class WelcomeThread extends Thread {
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        }catch(Exception e){}
    }
}
public class ThreadExample {
    public static void main(String[] args){
        new GoodMorningThread().start();
        new HelloThread().start();
        new WelcomeThread().start();
    }
}
