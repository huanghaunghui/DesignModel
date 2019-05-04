package abstractfactory;

/**
 * @auther hhh
 * @date 2019/5/3 13:47
 * @description
 */
public class ChocolateMike implements Milk {
    @Override
    public void parpare() {
        System.out.println("准备巧克力");
    }

    @Override
    public void make() {
        System.out.println("制作巧克力牛奶");
    }

    @Override
    public void complete() {
        System.out.println("巧克力牛奶制作完成");
    }
}
