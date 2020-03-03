package responsibilitychain.chain;

/**
 * @author hhh
 * @date 2020/3/3 9:48
 * @description
 */
public class Manager extends PricesHandler {

    @Override
    public void discount(Double discount) {
        if (discount<0.3){
            System.out.format("管理员审批通过%s的折扣",discount);
        }else{
            successor.discount(discount);
        }
    }
}
