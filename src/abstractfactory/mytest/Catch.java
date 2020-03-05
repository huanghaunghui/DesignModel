package abstractfactory.mytest;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther hhh
 * @date 2019/5/4 12:47
 * @description
 */
public class Catch {
    private static final Map<String,Class> map = new HashMap();

    static {
        map.put("CUSTOMERNAME",CustomerCatch.class);
    }

    public void init(){
        map.forEach((k,v)->{
            CustomerCatch customerCatch = new CustomerCatch();
            customerCatch.wholeRefresh();
        });
    }
}
