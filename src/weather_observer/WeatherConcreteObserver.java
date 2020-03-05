package weather_observer;

/**
 * @author hhh
 * @date 2020/3/5 15:48
 * @description 具体的观察者对象，实现更新的方法，使自身的状态与目标的状态保持一致
 *  所需变量：
 *        1、观察者名称
 *        2、天气情况内容
 *        3、提醒的内容
 */
public class WeatherConcreteObserver implements WeatherObserver {

    /**
     * 观察者名称
     */
    private String observerName;
    /**
     * 天气情况内容，消息从目标对象处获得
     */
    private String weatherContent;
    /**
     * 提醒的内容
     */
    private String remindContent;

    /**
     * 观察者状态
     */
    private String weatherObserverState;

    /**
     * 获取目标类的对象状态，同步到观察者状态
     * @param weatherSubject
     */
    @Override
    public void update(WeatherSubject weatherSubject) {
        weatherContent=((WeatherConcreteSubject) weatherSubject).getWeatherContent();
        String msg = String.format("%s收到了%s,%s",observerName,weatherContent,remindContent);
        System.out.println(msg);
    }



    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getRemindContent() {
        return remindContent;
    }

    public void setRemindContent(String remindContent) {
        this.remindContent = remindContent;
    }

    public String getWeatherObserverState() {
        return weatherObserverState;
    }

    public void setWeatherObserverState(String weatherObserverState) {
        this.weatherObserverState = weatherObserverState;
    }
}
