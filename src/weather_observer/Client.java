package weather_observer;

/**
 * @author hhh
 * @date 2020/3/5 16:43
 * @description 测试天气观察者
 */
public class Client {
    public static void main(String[] args) {
        //创建目标
        WeatherConcreteSubject subject = new WeatherConcreteSubject();
        //创建观察者 - 需要收到通知的女朋友
        WeatherConcreteObserver observerGirl = new WeatherConcreteObserver();
        observerGirl.setObserverName("女朋友");
        observerGirl.setRemindContent("是我们的第一次约会，地点西湖公园，不见不散");
        //创建观察者 - 需要收到通知的女朋友
        WeatherConcreteObserver observerMother = new WeatherConcreteObserver();
        observerMother.setObserverName("老妈");
        observerMother.setRemindContent("是一个购物的好日子，记得去商场购物");
        //注册观察者
        subject.attach(observerGirl);
        subject.attach(observerMother);
        //发布目标天气，自动通知注册的观察者
        subject.setWeatherContent("今天天气26℃，凉风习习，蓝天白云");
    }
}
