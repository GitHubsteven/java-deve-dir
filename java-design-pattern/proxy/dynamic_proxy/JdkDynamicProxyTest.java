package proxy.dynamic_proxy;

import proxy.staitc_proxy.IOrderService;
import proxy.staitc_proxy.IOrderServiceImpl;

import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        IOrderService orderService = new IOrderServiceImpl();

        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy<>(orderService);

        /**
         * method 1
         */
        IOrderService orderProxy = (IOrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(),
                orderService.getClass().getInterfaces(), jdkDynamicProxy);
//        orderProxy.importOrder();

        /**
         * method2
         */

        JdkDynamicProxy<IOrderService> proxyHandler = new JdkDynamicProxy<>(orderService);
        IOrderService proxy = proxyHandler.getProxy();
        proxy.importOrder();

    }
}
