package weather_observer;

/**
 * @author hhh
 * @date 2020/3/5 15:46
 * @description 具体的目标对象，负责将有关状态存入到相应的观察者对象中
 */
public class WeatherConcreteSubject extends WeatherSubject {

    /**
     *目标对象的状态
     */
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //通知所有天气订阅的观察者
        this.modifyObserver();
    }
}
