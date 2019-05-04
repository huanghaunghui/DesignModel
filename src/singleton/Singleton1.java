package singleton;

/**
 * @auther hhh
 * @date 2019/5/4 10:59
 * @description
 */
public class Singleton1 {
    private static final Singleton1 uniqueInstance = new Singleton1();

    //限制产生多个对象
    private Singleton1(){ }

    public static Singleton1 getInstance(){
        return uniqueInstance;
    }
}
