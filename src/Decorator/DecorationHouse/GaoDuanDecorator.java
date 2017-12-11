package Decorator.DecorationHouse;

/**
 * Created by TigerChain
 * 具体的装饰者--高端装修
 */
public class GaoDuanDecorator extends AbstractDecorator {

    private AbstractHouse abstractHouse ;

    public GaoDuanDecorator(AbstractHouse abstractHouse){
        this.abstractHouse = abstractHouse ;
    }

    @Override
    String getCategory() {
        return abstractHouse.getCategory()+" 高端大气上档次";
    }

    @Override
    String getCost() {
        return " 10 万元装修";
    }
}
