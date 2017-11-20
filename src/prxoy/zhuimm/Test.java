package prxoy.zhuimm;

/**
 * Created by TigerChain
 */
public class Test {
    public static void main(String args[]){

//        XiaoMing xiaoMing = new XiaoMing();
//        MM xiaoqian = new MM("小倩") ;
//        ProxyTigerChain proxyChain = new ProxyTigerChain(xiaoMing,xiaoqian) ;
//        proxyChain.giveFlowers();
//        proxyChain.writeLoveLetters();
//        proxyChain.buyClothes();
//        proxyChain.doSomthing();


        ZhuimmWay zhuimmWay = ZhuimmFactory.getInstance("小倩") ;
        zhuimmWay.giveFlowers();
        zhuimmWay.writeLoveLetters();
        zhuimmWay.buyClothes();
        zhuimmWay.doSomthing();

    }
}
