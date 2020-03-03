package responsibilitychain;

import responsibilitychain.chain.PricesHandler;
import responsibilitychain.factory.PricesHandlerFactory;

import java.util.Random;

/**
 * @author hhh
 * @date 2020/3/3 9:56
 * @description 责任链模式
 *  顾客申请折扣，触发priceHandler对请求价格的处理，在处理价格之前通过工厂方法创建了一个priceHandler的实例，
 *  如果实例处理不了折扣，触发后继，然后调用工厂设置后继并创建新的PriceHandler来处理折扣，还是处理不了继续申请，直到成功。
 */
public class Customer {
    private PricesHandler pricesHandler;

    public void setPriceHandler(PricesHandler pricesHandler) {
        this.pricesHandler = pricesHandler;
    }

    public void requestDiscount(Double discount){
        pricesHandler.discount(discount);
    }
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PricesHandlerFactory.getHandlerFactory());
        Random random = new Random();
        for(int i=1;i<=100;i++){
            System.out.print(i+":");
            customer.requestDiscount(random.nextDouble());
            System.out.println();
        }
    }
}
