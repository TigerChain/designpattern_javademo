package template.putAnimalInRefrigerator;

/**
 * Created by 0.0 on 2017/12/5.
 */
public class ConCreateTemplate {

    private IRefrige iRefrige ;
    private Animail animail ;

    public void handle(IRefrige iRefrige,Animail animail,ITemplate iTemplate){
        this.iRefrige = iRefrige;
        this.animail = animail ;
        iTemplate.open(iRefrige);
        iTemplate.putin(animail);
        iTemplate.close();
    }
}
