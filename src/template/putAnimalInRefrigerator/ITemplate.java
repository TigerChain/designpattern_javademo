package template.putAnimalInRefrigerator;

/**
 * Created by 0.0 on 2017/12/5.
 */
public interface ITemplate {
    // 打开冰箱
     void open(IRefrige iRefrige) ;
    //把动物装进去
     void putin(Animail animail) ;
    //把冰箱门盖上
     void close() ;
}
