package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 模版类
 */
public class ConCreateTemplate {
    private IRefrige iRefrige ;// 取得冰箱的引用
    private Animail animail ;  // 取得动物的引用
    // 把抽象模版接口当成参数传递过去
    public void handle(IRefrige iRefrige,Animail animail,ITemplate iTemplate){
        this.iRefrige = iRefrige;
        this.animail = animail ;
        iTemplate.open(iRefrige);
        iTemplate.putin(animail);
        iTemplate.close();
    }
}
