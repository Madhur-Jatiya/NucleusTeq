package phone;

public class SmartPhone extends Phone implements Camera, MusicPlayer {

    @Override
    public void click() {
        System.out.println("Click Method Override");
    }

    @Override
    public void record() {
        System.out.println("Record Method Override");
    }

    @Override
    public void play() {
        System.out.println("Play Method Override");
    }

    @Override
    public void stop() {
        System.out.println("Stop Method Override");
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public void sms() {
        super.sms();
    }

}
