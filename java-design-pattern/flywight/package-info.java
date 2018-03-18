package flywight;
/**
 * 享元模式：享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 *
 * 如果是为了减少内存开销，为森么不用单例模式呢？单例模式更加可以重复使用一个对象，减少内存开销，单例模式之创建单个模式，但是享元模式
 * 创造了多个实例来共享，实际上，创建实例池来保存实例，根据key来查找实例，如果没有找到，那么建议创建实例并且保存到池中。
 *
 * 这种模式和注册理念有点小相似，如果注册中心注册服务，如果有注册，则获取服务，如果没有，那么注册一个。
 **/