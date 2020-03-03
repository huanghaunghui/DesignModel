package responsibilitychain;

import responsibilitychain.chain.PricesHandler;
import responsibilitychain.factory.PricesHandlerFactory;

import java.util.Random;

/**
 * @author hhh
 * @date 2020/3/3 9:56
 * @description
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
