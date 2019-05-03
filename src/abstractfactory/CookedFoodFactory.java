package abstractfactory;

/**
 * @auther hhh
 * @date 2019/5/3 13:43
 * @description 这个工厂生产的是一个产品族，这个产品族中包含了牛奶与pizza，这个产品的等级结构是Cooked
 */
public class CookedFoodFactory implements FactoryInterface {
    @Override
    public Pizza createdPizza(String type) {
        if (type.equals("vegg")) {
            System.out.println("制作熟食Pizza");
            //熟食pizza的准备步骤
            Pizza pizza = new VeggPizza();
            pizza.parpare();
            pizza.make();
            pizza.complete();
            System.out.println("熟食Pizza制作完成");
            return pizza;
        }
        return null;
    }

    @Override
    public Milk createdMike(String type) {
        if (type.equals("cho")) {
            //热巧克力牛奶的准备步骤
            Milk milk = new ChocolateMike();
            milk.parpare();
            milk.make();
            milk.complete();
            return milk;
        }
        return null;
    }
}
