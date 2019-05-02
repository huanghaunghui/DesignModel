package factory;

/**
 * @auther hhh
 * @date 2019/5/2 22:38
 * @description 抽象工厂类，也是我们工厂设计模式的一个核心思想类，面向接口编程
 */
public interface Factory {
    Pizza createdPizza(String type);
}
