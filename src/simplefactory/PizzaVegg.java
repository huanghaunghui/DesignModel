package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:00
 * @description 蔬菜披萨
 */
public class PizzaVegg implements Pizza{

    @Override
    public void prepare() {//准备蔬菜
        System.out.println("准备蔬菜");
    }

    @Override
    public void make() {//开始制作蔬菜披萨
        System.out.println("开始制作蔬菜披萨");
    }

    @Override
    public void complete() {//蔬菜pizza制作成功
        System.out.println("蔬菜pizza制作成功");
    }
}
