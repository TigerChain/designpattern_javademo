package observer.wolf;

/**
 * Created by 抽象的观察者，普通的狼
 */
public abstract class NormalWolf {

    // 拿到被观察者的引用
    protected IWolf iWolf ;

    /**
     * 收到狼王下达的命令
     * @param str
     */
    public abstract void reciveCommand(String str) ;
}
