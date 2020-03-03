package responsibilitychain.chain;

/**
 * @author hhh
 * @date 2020/3/3 9:43
 * @description
 */
public abstract class PricesHandler {

    /**
     * 责任链的后继
     */
    PricesHandler successor;

    public void setSuccessor(PricesHandler successor) {
        this.successor = successor;
    }

    public abstract void discount(Double discount);
}
