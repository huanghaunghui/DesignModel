package factory.mytest;

/**
 * @auther hhh
 * @date 2019/5/2 23:34
 * @description
 */
public interface Factory {
    Pizza create(String type);

    /**
     * 在工厂模式中加入产品族
     */

    Milk createMike(String type);

    /**
     * 产品等级结构
     */
    Pizza createdColdPizza(String type);
}
