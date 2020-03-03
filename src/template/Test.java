package template;

/**
 * @author hhh
 * @date 2020/3/3 10:12
 * @description 模板模式
 * 拿制作饮料举例子
 *      制作奶茶              制作咖啡
 *  1、倒入水               1、倒入水
 *  2、倒入茶叶             2、倒入咖啡
 *  3、将水烧开             3、将水烧开
 *  4、加入牛奶             4、加入糖
 *  其中1,3操作相同，且制作步骤相同，可以使用模板模式
 *
 *  可以加入钩子函数，使程序更为灵活
 *  可以参考zuul的过滤器
 */

/**
 * 模板方法模式适用场景：
 * 1、算法或操作遵从相似的逻辑
 * 2、重构时，将相同代码抽取到父类中
 * 3、重要、复杂的算法，核心方法设计为模板算法
 */
public class Test {

    static ThreadLocal<Boolean> THREAD_LOCAL = new ThreadLocal<Boolean>();

    public static void main(String[] args) {
        DrinkTemplate drinkTemplate = new Tea();
        THREAD_LOCAL.set(false);
        drinkTemplate.makeDrink();
        THREAD_LOCAL.remove();
    }
}
