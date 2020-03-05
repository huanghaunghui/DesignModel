package observermodemodel;

/**
 * @author hhh
 * @date 2020/3/5 15:48
 * @description 具体的观察者对象，实现更新的方法，使自身的状态与目标的状态保持一致
 */
public class ConcreteObserver implements Observer {
    /**
     * 观察者状态
     */
    private String observerState;

    /**
     * 获取目标类的对象状态，同步到观察者状态
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        observerState=((ConcreteSubject)subject).getSubjectState();
    }
}
