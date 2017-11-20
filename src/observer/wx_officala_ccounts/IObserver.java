package observer.wx_officala_ccounts;

/**
 * Created by TigerChain
 * 定义观察者接口
 */
public interface IObserver {
    // 观察者收到信息,内容为 info
    void reciveContent(String info) ;
}
