package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 定义一台松下冰箱
 */
public class PanasonnicRefrige implements IRefrige {

    private String model ;
    @Override
    public String getRefrigeModel() {
        return this.model!=null?this.model:"";
    }

    @Override
    public void setModel(String model) {
        this.model = model ;
    }
}
