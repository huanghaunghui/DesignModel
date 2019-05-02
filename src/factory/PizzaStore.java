package factory;

/**
 * @auther hhh
 * @date 2019/5/2 22:57
 * @description
 */
public class PizzaStore implements Factory {
    void orderPizza(String type){
        Pizza pizza = this.createdPizza(type);
        pizza.prepared();
        pizza.make();
        pizza.complate();
    }

    @Override
    public Pizza createdPizza(String type) {
        if (type.equals("Vegg")) {
            return new VeggPizza();
        }
        if (type.equals("Meet")) {
            return new MeetPizza();
        }
        return null;
    }

}
