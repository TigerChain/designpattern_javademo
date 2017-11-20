package adapter.objectadapter;

/**
 * 这是投影仪，我就是 VGA 和 HDMI 接口的
 */
public class Projector {
        // 我要的就是 VGA 或者 HDMI 接口
        public String getVgaOrHdmi(VgaOrHdmi vgaOrHdmi){
            return vgaOrHdmi.getVgaOrHdmi() ;
        }
}
