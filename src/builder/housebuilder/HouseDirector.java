package builder.housebuilder;

/**
 * Created by TigerChain
 * 设计师
 */
public class HouseDirector {

    public void buildHouse(HouseBuilder houseBuilder){
        houseBuilder.doFoundation();
        houseBuilder.doFrame();
        houseBuilder.dpPouring();
    }
}
