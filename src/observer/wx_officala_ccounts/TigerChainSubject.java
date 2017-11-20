package observer.wx_officala_ccounts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TigerChain
 * 定义一个真实的被观察者 TigerChain「公号的作者」
 * 里面存了订阅 TigerChain 微信公众账号的读者
 */
public class TigerChainSubject implements IWxServerSubject {

    // 订阅者列表「观察者列表」，即关注 TigerChain 公号的读者
    private List<IObserver> observers = new ArrayList<>() ;
    //作者更新公号的内容 
    private String updateContent ;

    @Override
    public void attchObserver(IObserver iObserver) {
        observers.add(iObserver) ;
    }

    @Override
    public void detachObserver(IObserver iObserver) {
        if(observers.contains(iObserver)) {
            observers.remove(iObserver);
        }
    }

    @Override
    public void notifyObserver() {
        for (IObserver iObserver:observers) {
            iObserver.reciveContent(updateContent);
        }
    }

    /**
     * 是否关注我的公号
     * @param iObserver
     * @return
     */
    public boolean isAttchObserver(IObserver iObserver){
        return observers.contains(iObserver) ;
    }

    /**
     * TigerChain 在公号中发布文章
     * @param updateContent
     */
    public void submitContent(String updateContent){
        this.updateContent = updateContent ;
        this.notifyObserver();
    }
}
