package factory;

import simplefactory.PizzaStore;

/**
 * @auther hhh
 * @date 2019/5/2 22:53
 * @description
 */
public class VeggPizza implements Pizza {

    @Override
    public void prepared() {
        System.out.println("准备蔬菜");
    }

    @Override
    public void make() {
        System.out.println("制作蔬菜披萨");
    }

    @Override
    public void complate() {
        System.out.println("制作完成");
    }
}
