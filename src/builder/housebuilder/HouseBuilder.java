package builder.housebuilder;

/**
 * Created by TigerChain
 * 房子的建造者抽象类
 */
public interface HouseBuilder {
    // 打地基
    void doFoundation() ;
    // 盖框架
    void doFrame() ;
    // 浇灌
    void dpPouring() ;
    // 房子建成
    House getHouse() ;
}
