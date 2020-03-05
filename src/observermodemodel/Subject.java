package observermodemodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hhh
 * @date 2020/3/5 15:44
 * @description 目标对象
 * 他知道观察他的观察者，并提供注册（添加）和删除观察者的接口
 */
public class Subject {
    /**
      * 所有注册的观察者
      */
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }
    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }
    /**
     * 通知所有注册的观察者
     */
    public void modifyObserver(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

}
