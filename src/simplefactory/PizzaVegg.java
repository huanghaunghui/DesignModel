package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:00
 * @description 蔬菜披萨
 */
public class PizzaVegg implements Pizza{

    @Override
    public void prepare() { System.out.println("准备蔬菜"); }

    @Override
    public void make() { System.out.println("开始制作蔬菜披萨"); }

    @Override
    public void complete() { System.out.println("蔬菜pizza制作成功"); }
}
