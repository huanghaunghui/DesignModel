package weather_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hhh
 * @date 2020/3/5 15:44
 * @description 目标对象
 * 他知道观察他的观察者，并提供注册（添加）和删除观察者的接口
 */
public class WeatherSubject {
    /**
      * 所有注册的观察者
      */
    private List<WeatherObserver> observers = new ArrayList<>();

    /**
     * 将订阅天气的人添加到观察者列表中
     * @param observer
     */
    public void attach(WeatherObserver observer){
        observers.add(observer);
    }
    /**
     * 将订阅天气的人从观察者列表中移除
     * @param observer
     */
    public void detach(WeatherObserver observer){
        observers.remove(observer);
    }
    /**
     * 将天气信息通知所有注册的观察者
     */
    public void modifyObserver(){
        for (WeatherObserver observer : observers) {
            observer.update(this);
        }
    }

}
