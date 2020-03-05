package factory;

/**
 * @auther hhh
 * @date 2019/5/2 23:10
 * @description
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore2 pizzaStore2 = new PizzaStore2();
        pizzaStore2.orderPizza("vegg");

        System.out.println("----------------------");

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Meet");
    }
}
