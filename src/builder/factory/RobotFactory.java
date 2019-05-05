package builder.factory;


/**
 * @auther hhh
 * @date 2019/5/4 17:12
 * @description 演示对比工厂与建造者模式对比
 * 从现在代码上来看现在属性设置 非常的直接，我们不知道有那些构造细节
 */
public class RobotFactory implements Factory{
    public Robot create(){
        SingleRobot robot = new SingleRobot();
        robot.setHead("聪明的头脑");//?? 这个”聪明的头脑“从何而来，难道只是一个String吗？如何找到实现细节，如何加工才能得到这个聪明的头脑
        robot.setBody("身体");
        robot.setLegs("腿");
        robot.setHand("手");
        return robot;
    }
}
