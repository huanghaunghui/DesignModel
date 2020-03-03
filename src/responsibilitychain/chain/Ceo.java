package responsibilitychain.chain;

/**
 * @author hhh
 * @date 2020/3/3 9:47
 * @description
 */
public class Ceo extends PricesHandler {
    @Override
    public void discount(Double discount) {
        if (discount<0.7){
            System.out.format("CEO审批通过%s的折扣",discount);
        }else{
            System.out.format("折扣太高%s，直接拒绝",discount);
        }
    }
}
