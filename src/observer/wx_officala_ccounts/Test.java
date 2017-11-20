package observer.wx_officala_ccounts;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){

        IWxServerSubject iWxServerSubject = new TigerChainSubject() ;
        // 微信用户
        ReaderObserver zhangsai = new ReaderObserver("张三") ;
        ReaderObserver lisi = new ReaderObserver("李四") ;
        ReaderObserver wangwu = new ReaderObserver("王五") ;
        ReaderObserver zhaoLiu = new ReaderObserver("赵六") ;

        // 微信用户张三关注我的公号「即订阅」
        iWxServerSubject.attchObserver(zhangsai);
        // 微信用户李四关注我的公号「即订阅」
        iWxServerSubject.attchObserver(lisi);
        // 微信用户王五关注我的公号「即订阅」
        iWxServerSubject.attchObserver(wangwu);

        // 我「被观察者」发布了一篇文章--观察者模式
        ((TigerChainSubject)iWxServerSubject).submitContent("人人都会设计模式：观察者模式") ;

        boolean isAttch = ((TigerChainSubject)iWxServerSubject).isAttchObserver(zhaoLiu) ;
        if(!isAttch){
            System.out.println(zhaoLiu.getUname()+"你好！你还没有关注 TigerChain ，请关注先，谢谢");
        }
    }
}
