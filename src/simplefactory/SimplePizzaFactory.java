package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 21:04
 * @description 简单工厂核心类，用来制作不同种类的pizza
 */
public class SimplePizzaFactory {

    public Pizza createdPizza(String pizzaType){
        if (pizzaType.equals("PizzaVegg")){
            return new PizzaVegg();
        }
        if (pizzaType.equals("PizzaMeet")){
            return new PizzaMeet();
        }else {
            return null;
        }
    }
}
