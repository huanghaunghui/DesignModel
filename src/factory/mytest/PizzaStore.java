package factory.mytest;

/**
 * @auther hhh
 * @date 2019/5/2 23:37
 * @description
 */
public class PizzaStore implements Factory {

    void orderPizza(String type){
        Pizza pizza = this.create(type);
        pizza.prepared();
        pizza.make();
        pizza.complate();
    }

    @Override
    public Pizza create(String type) {
        if (type.equals("v")) {
            return new VeggPizza();
        }
        return null;
    }

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("v");
    }
}
