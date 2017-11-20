package prxoy.monkeyking.dymonkeyking;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class ToWestProxy implements InvocationHandler {
    // 需要代理的对象即真实对象
    private Object delegate ;

    public Object getProxy(Object delegate){
        this.delegate = delegate ;
        // 动态构建一个代理
        return  Proxy.newProxyInstance(delegate.getClass().getClassLoader(),delegate.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(delegate,args) ; // 通过反射调用真实对象对应的方法
    }
}
