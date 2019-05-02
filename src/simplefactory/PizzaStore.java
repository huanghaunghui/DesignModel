package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:10
 * @description
 */
public class PizzaStore {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public void orderPizza(String pizzaType) {
        System.out.println("客户开始预定Pizza！");
        Pizza pizza = simplePizzaFactory.createdPizza(pizzaType);
        pizza.prepare();
        pizza.make();
        pizza.complete();
        System.out.println("披萨创建完成！");
    }
}
