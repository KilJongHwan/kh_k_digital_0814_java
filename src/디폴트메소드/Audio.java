package 디폴트메소드;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnON() {
        System.out.println("Audio ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio OFF");
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
        System.out.println("Current Audio Volume : " + this.volume);
    }
    void getInfo(){
        System.out.println("Audio");
        System.out.println("Current Audio Volume : " + volume);
    }
    @Override
    public void setMute(boolean mute){
        if (mute)
            System.out.println("Audio Mute");
        else
            System.out.println("Audio Unmute");
    }
}
