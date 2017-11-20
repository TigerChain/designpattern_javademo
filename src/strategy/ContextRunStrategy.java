package strategy;

/**
 * 上下文 持有 strategy.IRunStrategy 的引用
 */
public class ContextRunStrategy {

    private IRunStrategy iRunStrategy ;

    public ContextRunStrategy(IRunStrategy iRunStrategy){
        this.iRunStrategy = iRunStrategy ;
    }

    /**
     * 选择道路
     */
    public void choiceRoad(){
        iRunStrategy.escapeRoute();
    }
}
