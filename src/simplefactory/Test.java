package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:40
 * @description
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("PizzaVegg");
        pizzaStore.orderPizza("PizzaMeet");
    }
}
