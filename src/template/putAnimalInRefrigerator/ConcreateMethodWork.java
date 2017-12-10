package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 具体的模版类
 */
public class ConcreateMethodWork extends AbstractMothodWork {

    private IRefrige iRefrige ;
    private Animail animail ;

    public ConcreateMethodWork(){
        System.out.println("分为三步");
    }

    @Override
    void open(IRefrige iRefrige) {
        this.iRefrige = iRefrige ;
        System.out.println("第 1 步把 "+iRefrige.getRefrigeModel()+" 门打开");
    }

    @Override
    void putin(Animail animail) {
        this.animail = animail ;
        System.out.println("第 2 步把 "+animail.getAnimailName()+" 装进去");
    }

    @Override
    void close() {
        System.out.println("第 3 步把冰箱门盖上");
    }
}
