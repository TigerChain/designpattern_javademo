package Decorator.SelectCloths;

/**
 * Created by TigerChain
 * 具体的上衣装饰者，皮夹克
 */
public class Jacket implements IOuter {

    private Person person ;

    public Jacket(Person person){
        this.person = person ;
    }

    @Override
    public String getCloths() {
        return person.getCloths()+" 皮夹克";
    }

    @Override
    public String getOuter() {
        return "---上衣";
    }
}
