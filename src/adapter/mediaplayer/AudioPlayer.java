package adapter.mediaplayer;

/**
 * Created by 0.0 on 2017/11/10.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter ;

    @Override
    public void play(String autdioType, String fileName) {
        if(autdioType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 "+fileName);
        }else if(autdioType.equalsIgnoreCase("vlc") || autdioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(autdioType);
            mediaAdapter.play(autdioType,fileName);
        }
    }
}
