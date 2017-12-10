package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 使用回调代替模版功能
 */
public interface ITemplate {
    // 打开冰箱
     void open(IRefrige iRefrige) ;
    //把动物装进去
     void putin(Animail animail) ;
    //把冰箱门盖上
     void close() ;
}
