package chain.of.responsibility;

/*
接下来我们将要谈谈责任链模式，有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，
请求在这条链上传递，直到某一对象决定处理该请求。
但是发出者并不清楚到底最终那个对象会处理该请求，所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。

此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，需要我们自己去实现，
同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。

链，这个模式同时用在请求拦截开发中，及安全检测，由于考虑到链中bean过多，我们是否该考虑将类放在同一个类中呢？如果真这样设计的话，我们是
否可以把这种设计理解为外观模式呢？
 */