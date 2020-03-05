package builder;

/**
 * @auther hhh
 * @date 2019/5/5 19:35
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Worker worker =new Worker();
        Robot robot = worker.buildRobot(new SmartRobotBuilder() );
        System.out.println(robot.getHead());
    }
}
