package adapter.classadapter;

/**
 * 测试类
 */
public class Test {
    public static void main(String args[]){
        //投影仪
        Projector projector = new Projector() ;
        //适配器
        VgaOrHdmi adapter = new MidiDp2VgaOrHdmiAdapter() ;
        // 最后得到投影仪想要的 VAG or HDMI 即可
        String str = projector.getVgaOrHdmi(adapter) ;
        System.out.println(str);
    }
}
