package observer.xiaoming;

/**
 * Created by TigerChain
 * 小明
 */
public class XiaoMing {
    private ICallback iCallback ;

    public void work(ICallback iCallback,String str){
        this.iCallback = iCallback ;
        System.out.println(str);
        System.out.println("小明说：收到马上去，过了半个小时") ;
    }
    // 小明把事情二完，要给妈妈一个反馈
    public void workDown(String str){
        if(iCallback!=null){
            iCallback.setResult(str);
        }
    }
}
