package template;

/**
 * @author hhh
 * @date 2020/3/3 10:24
 * @description
 */
public class Tea extends DrinkTemplate{

    @Override
    void addMaterial() {
        System.out.println("加入茶叶");
    }

    @Override
    boolean hookNeedaddIngredients() {
        return Test.THREAD_LOCAL.get();
    }

    @Override
    void addIngredients() {
        System.out.println("制作奶茶加入牛奶");
    }
}
