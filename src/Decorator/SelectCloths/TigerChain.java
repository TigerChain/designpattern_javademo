package Decorator.SelectCloths;

/**
 * Created by TigerChain
 * 具体的构件 -- TigerChain  即被装饰的对象
 */
public class TigerChain implements Person {
    @Override
    public String getCloths() {
        String selectResult = "TigerChain 搭配衣服：" ;
        return selectResult;
    }
}
