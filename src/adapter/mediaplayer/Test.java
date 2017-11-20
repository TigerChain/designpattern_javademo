package adapter.mediaplayer;

/**
 * Created by 0.0 on 2017/11/10.
 */
public class Test {
    public static void main(String args[]){
        AudioPlayer audioPlayer = new AudioPlayer() ;
        audioPlayer.play("mp3","one");
        audioPlayer.play("vlc","two");
        audioPlayer.play("mp4","three");
    }
}
