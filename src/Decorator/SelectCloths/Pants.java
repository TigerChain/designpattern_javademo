package Decorator.SelectCloths;

/**
 * Created by TigerChain
 * 裤子的具体装饰者--西裤
 */
public class Pants implements ITrousers {

    private Person person ;

    public Pants(Person person){
        this.person = person ;
    }

    @Override
    public String getCloths() {
        return person.getCloths()+"西裤";
    }
}
