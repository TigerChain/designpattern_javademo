package prxoy.zhuimm;

/**
 * Created by TigerChain
 * 主人工小明，真正的角色
 */
public class XiaoMing implements ZhuimmWay {

    // 要追的 MM
    private MM mm ;

    public void like(MM mm){
        this.mm = mm ;
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName()+" 送给你一朵花");
    }

    @Override
    public void writeLoveLetters() {
        System.out.println(mm.getName()+" 给你八封情书");
    }

    @Override
    public void buyClothes() {
        System.out.println(mm.getName()+" 这是给你买的衣服");
    }

    @Override
    public void doSomthing() {
        System.out.println("给 "+mm.getName()+"说好听的话");
        System.out.println("给 "+mm.getName()+"洗衣服，买单等等一系列手段");
    }
}
