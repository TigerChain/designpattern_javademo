package prxoy.zhuimm;

/**
 * Created by 0.0 on 2017/11/14.
 */
public class ProxyTigerChain implements ZhuimmWay {

    private XiaoMing xiaoMing ;

    public ProxyTigerChain(XiaoMing xiaoMing, MM mm){
        this.xiaoMing = xiaoMing ;
        xiaoMing.like(mm);
    }

    @Override
    public void giveFlowers() {
        xiaoMing.giveFlowers();
    }

    @Override
    public void writeLoveLetters() {
        xiaoMing.writeLoveLetters();
    }

    @Override
    public void buyClothes() {
        xiaoMing.buyClothes();
    }

    @Override
    public void doSomthing() {
        xiaoMing.doSomthing();
    }
}
