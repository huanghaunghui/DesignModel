package abstractfactory;

/**
 * @auther hhh
 * @date 2019/5/3 13:35
 * @description
 */
public interface FactoryInterface {

    /**
     * 我们能够看到，我们的接口类只需要关心我们的产品族，意思就是无论该产品有多少产品等级，我们只有这样的简单明了的两种
     * 或者多种抽象方法，不关心产品等级，大多数情况下产品等级是具体工厂关心
     *
     * 它只暴露给外面一个信息，信息为createdPizza与createdMike
     */

    //产品族 Pizza与Milk
    Pizza createdPizza(String type);

    Milk createdMike(String type);

    /**
     * 这个工厂类，没有创建产品等级的结构的方法，是不是有所欠缺呢？
     *      不欠缺，这是与工厂设计模式中的区别，
     */
}
