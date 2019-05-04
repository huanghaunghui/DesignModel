package singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther hhh
 * @date 2019/5/4 10:56
 * @description 懒汉式 （延迟对象初始化，节省了资源）：这种写法当有多个线程同时访问的时候，会产生多个实例，无法保证单例
 *      解决方法：
 *          1、使用synchronized锁住代码块，只让一个线程进入
 *          2、直接初始化静态变量，这样就保证了线程安全（）
 */
public class Singleton {
    //利用静态变量记录变量的唯一实例
    private static Singleton uniqueInstance;

    //构造私有化，只有Singleton类内才可以调用构造器
    private Singleton() { }


    public static Singleton getInstance(){
        Lock LOCK = new ReentrantLock();
        LOCK.lock();
        try {
            if (uniqueInstance ==null){
                uniqueInstance = new Singleton();
            }
            return uniqueInstance;
        }finally {
            LOCK.unlock();
        }
    }
}
