package Thread연습4;

import static java.lang.Thread.sleep;

// Thread 안전하게 종료 방법, stop() 메소드는 사용 중지
public class ThreadMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        try{
            sleep(3000);
        } catch (InterruptedException e){}
        runThread.interrupt();
    }
}
class RunThread extends Thread{
//    private boolean stop = false;   //stop 플래스 설정
//
//    public void setStop(boolean stop){
//        this.stop = stop;
//    }
    @Override
    public void run(){
        try{

            while (true) {
                System.out.println("Thread is running.......");
                sleep(1);
            }
        }catch (InterruptedException e){
            System.out.println("Interrupt Occurred!!!");
        }
        System.out.println("Resource Cleared...");
        System.out.println("Run End...");

    }
}