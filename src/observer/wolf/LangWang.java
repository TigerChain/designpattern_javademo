package observer.wolf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TigerChain
 * 狼王「被观察者，下面的狼都看狼王的眼色行事」，是一个单例模式
 */
public class LangWang implements IWolf{

    private static LangWang instance ;
    private LangWang(){}
    public static LangWang getInstance(){
        if(instance == null){
            synchronized (LangWang.class){
                if(instance == null){
                    instance = new LangWang() ;
                }
            }
        }
        return instance ;
    }

    // 除过狼王外的狼「观察者」
    private List<NormalWolf> observers = new ArrayList<>() ;
    // 狼王下达的命令
    private String mingLing  ;

    @Override
    public void attchObserver(NormalWolf observer) {
        observers.add(observer);
    }

    @Override
    public void detchObserver(NormalWolf observer) {
        if(observers.contains(observer)){
            observers.remove(observer) ;
        }
    }

    @Override
    public void notifyObserver(String str) {
        for(NormalWolf observer:observers){
            observer.reciveCommand(str);
        }
    }

    /**
     * 下达命令
     * @param mingLing
     */
    public void xiaDaMingling(String mingLing){
        this.mingLing = mingLing ;
        this.notifyObserver(mingLing);
    }
}
