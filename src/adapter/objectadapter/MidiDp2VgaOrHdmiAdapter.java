package adapter.objectadapter;

/**
 * 适配器，既是 MINIDP 接口也是 VAGORHDMI 接口，这样就可以把 MINIDP 转成
 * VAG OR HDMI 接口
 */
public class MidiDp2VgaOrHdmiAdapter  implements VgaOrHdmi{

    private MiniDp miniDp ;

    public MidiDp2VgaOrHdmiAdapter(MiniDp miniDp){
        this.miniDp = miniDp ;
    }

    @Override
    public String getVgaOrHdmi() {
       return  convertMiniDp2VgaOrHdmi() ;
    }
    /**
     * 把 MINIDP 转化成 VAG 或 HDMI 方法
     * @return
     */
    private String convertMiniDp2VgaOrHdmi(){
        //拿到源
        String str = miniDp.outPutMinkDp();
        System.out.println(str+" \n 经过适配器转化 ");
        // 为这简单起见，这里直接修改源
        str = "输出变成  VGA 和 HDMI 接口" ;
        return str ;
    }
}
