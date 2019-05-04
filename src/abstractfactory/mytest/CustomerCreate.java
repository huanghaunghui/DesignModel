package abstractfactory.mytest;

/**
 * @auther hhh
 * @date 2019/5/4 12:50
 * @description
 */
public class CustomerCreate implements CatchCreate{

    @Override
    public CatchCreate create() {
        return new CustomerCreate();
    }
}
