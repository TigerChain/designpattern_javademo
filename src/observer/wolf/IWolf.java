package observer.wolf;

/**
 * Created by TigerChain
 * 抽象的被观察者
 */
public interface IWolf {
    // 添加观察者
    void attchObserver(NormalWolf observer) ;
    // 移除观察者
    void detchObserver(NormalWolf observer) ;
    // 通知观察者
    void notifyObserver(String str) ;
}
