package Decorator.DecorationHouse;

/**
 * Created by TigerChain
 * 具体的装饰者之一:简易装修
 */
public class DiDiaoDecorator extends AbstractDecorator {

    private AbstractHouse abstractHouse ;

    public DiDiaoDecorator(AbstractHouse abstractHouse){
        this.abstractHouse = abstractHouse ;
    }
    @Override
    String getCategory() {
        return this.abstractHouse.getCategory() + " 低调奢华有内涵";
    }

    @Override
    String getCost() {
        return " 8 万元装修";
    }
}
