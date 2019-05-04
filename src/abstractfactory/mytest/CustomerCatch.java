package abstractfactory.mytest;

/**
 * @auther hhh
 * @date 2019/5/4 12:48
 * @description
 */
public class CustomerCatch implements CatchUpdate{
    @Override
    public boolean wholeRefresh() {
        return true;
    }

    @Override
    public boolean simpleRefresh() {
        return true;
    }
}
