package 디폴트메소드;

public class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnON() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV OFF");
    }

    @Override
    public void setVolume(int vol) {
        if (vol > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(vol < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = vol;
        }
        System.out.println("Current TV Volume : " + this.volume);
    }
    void getInfo(){
        System.out.println("TV");
        System.out.println("Current TV Volume : " + volume);
    }
    @Override
    public void setMute(boolean mute){
        if (mute)
            System.out.println("TV Mute");
        else
            System.out.println("TV Unmute");
    }
}
