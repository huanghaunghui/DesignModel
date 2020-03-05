package builder.factory;

/**
 * @auther hhh
 * @date 2019/5/4 17:20
 * @description
 */
public class Test {
    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println(robotFactory.create().getHead());
    }
}
