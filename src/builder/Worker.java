package builder;

/**
 * @auther hhh
 * @date 2019/5/5 19:30
 * @description 指挥者
 */
public class Worker {
    public Robot buildRobot(RobotBuilder robotBuilder){
        robotBuilder.createHead();
        robotBuilder.createBody();
        robotBuilder.createLegs();
        return robotBuilder.createRobot();
    }
}
