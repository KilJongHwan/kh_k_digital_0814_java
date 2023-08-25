package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100;   // final static 강제 추가
    int MIN_VOLUME = 0;
    void turnON();  // public abstract 강제 추가
    void turnOff();
    void setVolume(int vol);
    // default method JDK 8 이후에 추가 됨
    default void setMute(boolean mute){
        if (mute) System.out.println("ALL MUTE");
        else System.out.println("MUTE CANCEL");
    }
    static void changeBattery(){
        System.out.println("Change Battery");
    }
}
