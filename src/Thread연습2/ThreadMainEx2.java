package Thread연습2;
// 다른 Thread 종료를 기다림(join())

import static java.lang.Thread.sleep;

public class ThreadMainEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try{
            sumThread.join(40);  // sumThread 가 작업을 완료할 때 까지 기다린다
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
        System.out.println("합 : " + sumThread.getSum());
    }
}

class SumThread extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run(){
        for (int i = 0; i <= 2100000000; i++){
            sum += 1;
        }
    }
}
