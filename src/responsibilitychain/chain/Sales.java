package responsibilitychain.chain;

/**
 * @author hhh
 * @date 2020/3/3 9:47
 * @description
 */
public class Sales extends PricesHandler {


    @Override
    public void discount(Double discount) {
        if (discount<0.05){
            System.out.format("销售员审批通过%S的折扣",discount);
        }else{
            successor.discount(discount);
        }
    }
}
