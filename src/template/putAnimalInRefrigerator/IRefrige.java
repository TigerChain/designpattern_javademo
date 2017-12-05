package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 抽象冰箱
 */
public interface IRefrige {
    //取得品牌的名字
    String getRefrigeModel() ;
    //设置冰箱品牌
    void setModel(String model) ;
}
