package Decorator.SelectCloths;

/**
 * Created by TigerChain
 * 上衣具体的装饰者---西服
 */
public class Suit implements IOuter {

    private Person person ;

    public Suit(Person person){
        this.person = person ;
    }

    @Override
    public String getCloths() {
        return person.getCloths()+"西装";
    }

    @Override
    public String getOuter() {
        return "---上衣 ";
    }
}
