package template;

/**
 * @author hhh
 * @date 2020/3/3 10:16
 * @description 饮料模板
 */
public abstract class DrinkTemplate {

    /**
     * 制作饮料
     */
    public void makeDrink() {
        addWater();
        addMaterial();
        boilWater();
        if (hookNeedaddIngredients()){
            System.out.println("钩子函数，判断需要加入原料");
            addIngredients();
        }else {
            System.out.println("无需新增配料");
        }
    }

    /**
     * 钩子函数，子类判断是否需要增加配料
     * @return
     */
    abstract boolean hookNeedaddIngredients();

    private void addWater() {
        System.out.println("开始倒入水...");
    }

    /**
     * 加入原料交给子类实现
     */
    abstract void addMaterial();

    private void boilWater() {
        System.out.println("将水烧开...");
    }

    /**
     * 加入配料由子类实现
     */
    abstract void addIngredients();
}
