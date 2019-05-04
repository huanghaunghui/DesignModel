package singleton;

/**
 * @auther hhh
 * @date 2019/5/4 11:17
 * @description 使用初始化静态变量的方法，保证懒汉式单例线程安全
 * 懒汉式如果不考虑代码同步问题（单线程运行的环境下，可以不去加同步锁）
 * 因为饿汉式扩展性不是很好，它直接在类加载的时候就对Singleton2进行了加载，如果对象比较复杂，占用内存资源比较多，建议在使用的时候在进行创建
 * 因为我们的类在加载过程中就进行了创建的话，会影响我们程序的启动时间
 */
public class Singleton2 { //饿汉式的单例模式是一中线程安全的单例设计模式，因为它能够在类加载的过程中初始化我们程序中的静态变量
    private static final Singleton2 uniqueInstance = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){//为了保证不同线程获取的instance是唯一的对象
        return uniqueInstance;
    }
}
