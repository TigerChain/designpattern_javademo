package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 抽象的模版类
 */
public abstract class AbstractMothodWork {
    // 打开冰箱
    abstract void open(IRefrige iRefrige) ;
    //把动物装进去
    abstract void putin(Animail animail) ;
    //把冰箱门盖上
    abstract void close() ;

    // 模版方法
    public void handle(IRefrige iRefrige,Animail animail){
        this.open(iRefrige);
        this.putin(animail);
        this.close();
    }
}
