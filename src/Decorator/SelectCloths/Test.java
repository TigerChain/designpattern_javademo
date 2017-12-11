package Decorator.SelectCloths;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){

        Person person = new TigerChain() ;
        System.out.println("方式一：全身西装");
        // 上衣西装
        IOuter suit = new Suit(person) ;
        System.out.println(suit.getCloths()+suit.getOuter());
        // 裤子西裤
        ITrousers pants = new Pants(person) ;
        System.out.println(pants.getCloths());

        System.out.println("方式二：皮夹克+牛仔裤");
        // 上衣皮夹克
        IOuter jacket = new Jacket(person) ;
        System.out.println(jacket.getCloths()+jacket.getOuter());
        // 裤子牛仔裤
        ITrousers jean = new Jean(person) ;
        System.out.println(jean.getCloths());

    }
}
