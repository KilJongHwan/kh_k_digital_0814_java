package Thread연습5;

import static java.lang.Thread.sleep;

// Daemon Thread : 다른 Thread 작업을 돕는 보조 Thread, Daemon Thread 이외의 thread 모두 종료 시 자동 종료
public class ThreadMainEx5 {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveTh autoSaveTh = new AutoSaveTh();
        autoSaveTh.setDaemon(true); // Daemon Thread 만드는 방법
        autoSaveTh.start();
        sleep(30000);
    }
}


class AutoSaveTh extends Thread{
    public void save(){
        System.out.println("작업 내용을 저장");
    }
    @Override
    public void run(){
        while (true){
            try {
                sleep(3000);
            } catch (InterruptedException e){}
            save();
        }
    }
}
