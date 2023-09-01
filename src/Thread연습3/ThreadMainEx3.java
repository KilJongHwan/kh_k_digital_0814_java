package Thread연습3;
// Thread 협업 : wait(), notify(), notifyAll()
// notify() : 일시 정지 상태에 있는 Thread 를 실행 대기 상태로 변경
// wait() : 자신을 일시 정지 상태로 만듦
public class ThreadMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 객체 생성
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}
class WorkObject{
    // synchronized : 멀티스레드 환경에서 임계역에서 접근을 방지하는 역할(Lock / Unlock)
    public synchronized void methodA(){
        System.out.println("ThreadA의 method() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadB 를 실헹 대기 상태로 만듦
        try {
            wait();
        } catch(InterruptedException e ){}
    }
    public synchronized void methodB(){
        System.out.println("ThreadB의 method() 작업 실행");
        notify(); // 일시 정지 상태에 있는 ThreadA 를 실헹 대기 상태로 만듦
        try {
            wait();
        } catch(InterruptedException e ){}
    }
}
class ThreadA extends Thread{
    final private WorkObject workObject;  //
    public ThreadA(WorkObject workObject){
        this.workObject = workObject;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            workObject.methodA();
        }
    }
}
class ThreadB extends Thread{
    final private WorkObject workObject;  //
    public ThreadB(WorkObject workObject){
        this.workObject = workObject;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            workObject.methodB();
        }
    }
}
