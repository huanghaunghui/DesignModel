package observermodemodel;

/**
 * @author hhh
 * @date 2020/3/5 15:44
 * @description 观察者接口，定义一个更新接口，给那些在目标对象发生改变的时候被通知的对象
 */
public interface Observer {
    /**
     * 观察者通知本对对象，传入目标对象，方便获取目标对象状态
     * @param subject
     */
    void update(Subject subject);
}
