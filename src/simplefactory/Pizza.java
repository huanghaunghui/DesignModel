package simplefactory;

/**
 * @auther hhh
 * @date 2019/5/2 20:58
 * @description 抽象产品类，作为父类出现供我们各种pizza种类集成
 */
public interface Pizza {
    public void prepare();//准备
    public void make();//生产
    public void complete();//完成
}
