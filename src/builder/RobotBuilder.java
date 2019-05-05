package builder;

/**
 * @auther hhh
 * @date 2019/5/5 19:17
 * @description 抽象建造者类，相对于工厂设计模式的抽象工厂类，区别:建造者模式更加关注了机器人构建的细节
 */
public interface RobotBuilder {//关注细节
    void createHead();//细节
    void createBody();//细节
    void createLegs();//细节

    /**
     * 理解工厂设计模式与建造者模式的区别与相同点，可以从该类看一下
     *      相同点：都是为了创建产品
     *      不同的：建造者模式更关注细节，工厂设计模式中只有一个设计方法
     */
    Robot createRobot();
}
