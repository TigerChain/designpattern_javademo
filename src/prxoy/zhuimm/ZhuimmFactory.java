package prxoy.zhuimm;

/**
 * Created by TigerChain
 * 定义一个工厂类，这样就屏蔽了客户端对代理的感知
 */
public class ZhuimmFactory {

    public static ZhuimmWay getInstance(String name){
        return new ProxyTigerChain(new XiaoMing(),new MM(name)) ;
    }
}
