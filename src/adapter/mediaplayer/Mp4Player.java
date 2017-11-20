package adapter.mediaplayer;

/**
 * Created by 0.0 on 2017/11/10.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 file "+ fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
