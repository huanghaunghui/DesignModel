package abstractfactory;

/**
 * @auther hhh
 * @date 2019/5/3 13:44
 * @description 这个工厂生产的是一个产品族，这个产品族中包含了牛奶与pizza，这个产品的等级结构是Row
 * 因为不同等级结构的产品，制作方式上有所区别所以我们的制作流程会出现在我们具体工厂里面
 * 在我们抽象工厂的模式中，我们的具体工厂需要根据实际的生产需求进行分类实现，达到的效果是用不同的具体工厂实现分类，
 * 满足我们生产上的需求（一般情况下，我们的具体工厂类更加多的去关心我们的产品等级结构）
 */
public class RowFoodFactory implements FactoryInterface {

    @Override
    public Pizza createdPizza(String type) {
        if (type.equals("vegg")) {
            //生pizza的准备步骤
            Pizza pizza = new VeggPizza();
            pizza.parpare();
            return pizza;
        }
        return null;
    }

    @Override
    public Milk createdMike(String type) {
        if (type.equals("cho")) {
            //生巧克力牛奶的准备步骤
            Milk milk = new ChocolateMike();
            milk.parpare();
            return milk;
        }
        return null;
    }
}
