package responsibilitychain.factory;

import responsibilitychain.chain.Ceo;
import responsibilitychain.chain.Director;
import responsibilitychain.chain.Manager;
import responsibilitychain.chain.PricesHandler;
import responsibilitychain.chain.Sales;

/**
 * @author hhh
 * @date 2020/3/3 9:56
 * @description
 */
public class PricesHandlerFactory {

    public static PricesHandler  getHandlerFactory(){
        PricesHandler sales = new Sales();
        PricesHandler director = new Director();
        PricesHandler manager = new Manager();
        PricesHandler ceo = new Ceo();

        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(ceo);
        return sales;
    }
}
