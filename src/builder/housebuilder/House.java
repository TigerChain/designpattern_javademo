package builder.housebuilder;

/**
 * Created by TigerChain
 * 最终的产品---房子
 */
public class House {
    // 打地基
    private String foundation ;
    // 盖框架
    private String frame ;
    // 浇筑
    private String pouring ;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getPouring() {
        return pouring;
    }

    public void setPouring(String pouring) {
        this.pouring = pouring;
    }
}
