package observer.wolf;

/**
 * Created by TigerChain
 * 捕猎狼---观察者
 */
public class BuLieLang extends NormalWolf {

    public BuLieLang(IWolf iWolf){
        this.iWolf = iWolf ;
        // 添加观察者，即捕猎狼放在狼王组织中
        this.iWolf.attchObserver(this);
    }

    @Override
    public void reciveCommand(String string) {
        System.out.println("捕猎狼：狼王开会传递的信息是 \n"+string+"\n");
    }
}
