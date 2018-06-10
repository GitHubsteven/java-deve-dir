package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy<T> implements InvocationHandler {
    private T target;

    public JdkDynamicProxy(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    @SuppressWarnings("unchecked")
    public T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }


    private void before() {
        System.out.println("===========perform befores=============");
    }

    private void after() {
        System.out.println("===========perform after=============");
    }
}
