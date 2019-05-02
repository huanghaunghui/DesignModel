package factory;

/**
 * @auther hhh
 * @date 2019/5/2 22:53
 * @description
 */
public class MeetPizza implements Pizza {
    @Override
    public void prepared() {
        System.out.println("准备肉");
    }

    @Override
    public void make() {
        System.out.println("制作肉披萨");
    }

    @Override
    public void complate() {
        System.out.println("制作完成");
    }
}
