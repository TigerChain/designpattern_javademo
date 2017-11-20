package prxoy.monkeyking.dymonkeyking;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){

        IToWest sunWuKong = new SunWuKong() ;

        // 取得动态代理
        IToWest proxy = (IToWest) new ToWestProxy().getProxy(sunWuKong);

        proxy.baohuTangSeng();
        proxy.xiangYaoChuMo();
        proxy.shangTianRuDi();
        System.out.println("我孙悟空能去得了西天");
    }
}
