package responsibilitychain.chain;

/**
 * @author hhh
 * @date 2020/3/3 9:48
 * @description
 */
public class Director extends PricesHandler {
    @Override
    public void discount(Double discount) {
        if (discount < 0.5) {
            System.out.format("主任审批通过%s的折扣", discount);
        } else {
            successor.discount(discount);
        }
    }
}
