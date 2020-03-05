package observermodemodel;

/**
 * @author hhh
 * @date 2020/3/5 15:46
 * @description 具体的目标对象，负责将有关状态存入到相应的观察者对象中
 */
public class ConcreteSubject extends Subject {

    /**
     *目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //设置目标对象状态时，通知
        this.modifyObserver();
    }
}
