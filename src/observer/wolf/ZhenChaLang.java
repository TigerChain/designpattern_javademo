package observer.wolf;

/**
 * Created by TigerChain
 * 侦查狼，另一个观察者
 */
public class ZhenChaLang extends NormalWolf {

    public ZhenChaLang(IWolf iWolf){
        this.iWolf = iWolf ;
        this.iWolf.attchObserver(this);
    }

    @Override
    public void reciveCommand(String string) {
        System.out.println("侦查狼：狼王开会传递的信息是 \n"+string);
    }
}
