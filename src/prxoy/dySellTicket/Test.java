package prxoy.dySellTicket;

import java.lang.reflect.Proxy;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static  void main(String args[]){
        // 定义个买票者
        User tigerChain = new User() ;
        tigerChain.setUname("TigerChain");
        tigerChain.setAddress("中国陕西");
        tigerChain.setSex("男");
        tigerChain.setIdNum("610326************");
        tigerChain.setPay("45.00");

        // 真实的买票员小张
        ISellTicket iSellTicket = new XiaoZhangSeller(tigerChain) ;

        // 动态代理
        DyAutoSellerProxy dyAutoSellerProxy = new DyAutoSellerProxy(iSellTicket) ;

        // 动态创建一个出票机，把出票交给出票机去处理
        ISellTicket iSellTicket1 = (ISellTicket) Proxy.newProxyInstance(iSellTicket.getClass().getClassLoader(),iSellTicket.getClass().getInterfaces(),dyAutoSellerProxy);

        iSellTicket1.sellTicket();
    }
}
