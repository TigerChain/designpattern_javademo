package Decorator.DecorationHouse;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){
        AbstractHouse jianYiHouse = new JianYi() ;
        AbstractDecorator diDiaoDecorator = new DiDiaoDecorator(jianYiHouse);
        System.out.println(diDiaoDecorator.getCategory()+diDiaoDecorator.getCost());


        AbstractHouse ouMei = new OuMei() ;
        AbstractDecorator gaoDuanDecorator = new GaoDuanDecorator(ouMei) ;
        System.out.print(gaoDuanDecorator.getCategory()+gaoDuanDecorator.getCost());
    }
}
