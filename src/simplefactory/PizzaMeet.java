package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:01
 * @description 肉类披萨
 */
public class PizzaMeet implements Pizza {

    @Override
    public void prepare() {
        System.out.println("准备肉");
    }

    @Override
    public void make() {
        System.out.println("开始制作肉披萨");
    }

    @Override
    public void complete() {
        System.out.println("肉pizza制作成功");
    }
}
