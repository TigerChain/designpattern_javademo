package Decorator.SelectCloths;

/**
 * Created by TigerChain
 * 具体的裤子装饰者--牛仔裤
 */
public class Jean implements ITrousers {

    private Person person ;
    public Jean(Person person){
        this.person = person ;
    }
    @Override
    public String getCloths() {
        return person.getCloths()+"牛仔裤";
    }
}
