package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:04
 * @description 简单工厂核心类，用来制作不同种类的pizza
 * 一旦程序在生产环境下新加入一家店面我们需要新家披萨种类，此时我们应该修改factory类，但是如此进行修改会影响其他分店
 * 最笨的方法：增加分店，为了不影响其他类，我们增加一个新的工厂类，但是这个方法十分不合适，这个时候我们只能发展更好的设计模式
 * 工厂设计模式应运而生：工厂模式一定要面向接口变成，简单工厂模式只是一个静态的类，没有能力提供其他类的继承，复写createdPizza方法的需求
 *
 */
public class SimplePizzaFactory {

    public Pizza createdPizza(String pizzaType) {
        if (pizzaType.equals("PizzaVegg")) {
            return new PizzaVegg();
        }
        if (pizzaType.equals("PizzaMeet")) {
            return new PizzaMeet();
        } else {
            return null;
        }
    }
}
