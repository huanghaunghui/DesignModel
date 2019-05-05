package builder;

/**
 * @auther hhh
 * @date 2019/5/5 19:21
 * @description
 */
public class SmartRobotBuilder implements RobotBuilder {

    private Robot robot = new Robot();

    @Override
    public void createHead() {
        String head = "Head";//低能儿
        String chip = "Smart";//智能芯片
        String chipHead = head+chip;//组装
        robot.setHead(chipHead);
    }

    @Override
    public void createBody() {
        robot.setBody("body");
    }

    @Override
    public void createLegs() {
        String legs = "legs";
        String single = "single";
        String singleLegs = legs+single;//组装
        robot.setLegs(singleLegs);
    }

    @Override
    public Robot createRobot() {
        return robot;
    }
}
