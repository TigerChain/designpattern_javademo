package observer.xiaoming;

/**
 * Created by TigerChain
 * 妈妈
 */
public class MomCallbackImpl implements ICallback {
    // 让小明去干某些事情
    public void say(XiaoMing xiaoMing,String str){
        xiaoMing.work(this,str);
    }
    // 收到小明的反馈
    @Override
    public void setResult(String str) {
        System.out.println(str);
        eat("妈妈说:好的知道了洗洗手吃饭吧");
    }

    public void eat(String str){
        System.out.println(str);
    }
}
