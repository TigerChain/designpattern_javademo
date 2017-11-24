package observer.callback.xiaoming;

/**
 * Created by TigerChain
 */
public class Test {
    public static void main(String args[]){
        XiaoMing xiaoMing = new XiaoMing() ;
        MomCallbackImpl momCallback = new MomCallbackImpl() ;

        momCallback.say(xiaoMing,"妈妈说：叫你爸回来吃饭");

        // 这一下就触发了回调,妈妈立马就收到信息了
        xiaoMing.workDown("小明说：我爸回来了");
    }
}
