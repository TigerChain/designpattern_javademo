package observer.wx_officala_ccounts;

/**
 * Created by TigerChain
 * 定义主题「被观察者接口」
 */
public interface IWxServerSubject {
    // 添加观察者
    void attchObserver(IObserver iObserver) ;
    // 移除观察者
    void detachObserver(IObserver iObserver) ;
    // 通知观察者
    void notifyObserver() ;
}
