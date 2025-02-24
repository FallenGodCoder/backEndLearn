                                                        单例模式
定义：
    保证一个类仅有一个实例，并提供一个访问它的全局访问点。
单例的本质：控制实例的数目

根据初始化的时间，单例模式分为:饱汉式和饿汉式。
    懒汉式是典型的时间换空间，也就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直都有
人使用的话，那就不会创建实例，则解约内存空间。如果要保证线程安全需要加同步synchronized。
    饿汉式是典型的空间还时间，当类装载的时候就会创建类的实例，不管你用不用，先创建出来，然后每次调用的时候，就不需要
再判断了，节省了运行时间。是线程安全的。



如何实现懒汉式的线程安全呢？
方法一：
    public static synchronized Singleton getInstance()
方法二：
   双重检查加锁：既可以实现线程安全，又能使性能不受到很大的影响。
   所谓双重检查加锁机制，指的是：并不是每次进入getInstance方法都需要同步，而是先不同步，进入方法过后，先检查
实例是否存在，如果不存在才进入下面的异步块，这是第一重检查。进入同步块过后，再次检查实例是否存在，如果不存在，
就在同步的情况下创建一个实例，这是第二重检查。这样一来，就只需要同步一次了，从而减少了多次在同步情况下进行判断
所浪费的时间。
   双重检查加锁机制的实现会使用一个关键字volatile，它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，所
有对该变量的读写都是直接操作共享内存从而确保多个线程能正确的处理该变量。


何时选用单例？
    当需要控制一个类的实例只能有一个，而且客户只能从一个全局访问点访问它时，可以选用单例模式，这些功能恰好是
单例模式要解决的问题。