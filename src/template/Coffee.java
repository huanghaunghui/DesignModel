package template;

/**
 * @author hhh
 * @date 2020/3/3 10:22
 * @description
 */
public class Coffee extends DrinkTemplate {
    @Override
    void addMaterial() {
        System.out.println("加入咖啡豆");
    }

    @Override
    boolean hookNeedaddIngredients() {
        return Test.THREAD_LOCAL.get();
    }

    @Override
    void addIngredients() {
        System.out.println("给咖啡加入糖");
    }
}
