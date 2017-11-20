package prxoy.dySellTicket;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by TigerChain
 * 自动出票机,为了演示名字这样想,其实这是一个万能的动态代理
 */
public class DyAutoSellerProxy implements InvocationHandler {

    private Object object ;

    public DyAutoSellerProxy(Object object){
        this.object = object ;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args) ;
    }
}
