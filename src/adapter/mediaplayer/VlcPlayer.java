package adapter.mediaplayer;

/**
 * Created by 0.0 on 2017/11/10.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc file "+fileName);
    }
}
