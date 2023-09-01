package Thread연습1;
// 하나의 프로그램내에서 여러가지 일을 동시에 수행 하는 것
public class ThreadMainEx1 {
    public static void main(String[] args) {
        // Thread 클래스를 상속 받아서 Thread 생성
        Thread testTh = new CustomThread();
        testTh.start();

        // Runnable 인터페이스를 상속 받아서 Thread 생성
        Runnable runTask = new InterThread(); // 실제 작업 내용을 가지고 있지만 실제 스레드는 아님
        Thread runTh1 = new Thread(runTask);
        Thread runTh2 = new Thread(runTask);

        runTh1.start();
        runTh2.start();

        // 익명 객체로 Thread 생성 방법
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum =0;
                for (int i =0; i <= 10; i++){
                    sum += i;
                    System.out.println(Thread.activeCount() +  "인터페이스 : " + sum);
                }
                System.out.println(Thread.currentThread() + "합 : " + sum);
            }
        };
        Thread anonymous =  new Thread(task);
        anonymous.start();

        // 람다식 Thread 생성 방법
        Runnable task2 = () -> {
            int sum =0;
            for (int i =0; i <= 10; i++){
                sum += i;
                System.out.println(Thread.activeCount() +  "인터페이스 : " + sum);
            }
            System.out.println(Thread.currentThread() + "합 : " + sum);
        };
        Thread ramda = new Thread(task2);
        ramda.start();
    }
}
// 상속 받아서 Thread 만들기
class CustomThread extends Thread {
    @Override
    public void run(){
        int sum =0;
        for (int i =0; i <= 10; i++){
            sum += i;
            System.out.println("상속 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
class InterThread implements Runnable {
    @Override
    public void run() {
        int sum =0;
        for (int i =0; i <= 10; i++){
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
