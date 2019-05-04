package abstractfactory;

/**
 * @auther hhh
 * @date 2019/5/3 14:00
 * @description
 */
public class Store{

    // product->产品  productFamily-》产品族  productLevel-》产品等级结构
    public static void consume(String product,String productFamily,String productLevel){
        if (product.equals("Pizza")) {
            if (productFamily.equals("vegg")){
                if (productLevel.equals("cooked")){
                    CookedFoodFactory cookedFoodFactory = new CookedFoodFactory();
                    cookedFoodFactory.createdPizza(productFamily);//调用生产熟蔬菜披萨方法
                }
            }
        }
    }

    public static void main(String[] args) {
        consume("Pizza","vegg","cooked");
        System.out.println(Runtime.getRuntime());
    }
}
