package adapter.mediaplayer;

/**
 * Created by 0.0 on 2017/11/10.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer advanceMediaPlayer ;

    public MediaAdapter(String mediaType){
        if(mediaType.equals("vlc")){
            advanceMediaPlayer = new VlcPlayer() ;
        }else if(mediaType.equals("mp4")){
            advanceMediaPlayer = new Mp4Player() ;
        }
    }

    @Override
    public void play(String autdioType, String fileName) {
        if(autdioType.equals("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if(autdioType.equals("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
