package factory;


/**
 * @auther hhh
 * @date 2019/5/2 22:58
 * @description 这个时候如果新加入披萨店面的时候，我们只需要实现factory就可以了，不需要修改factory类
 * （如果新增加店面的时候，不会影响到其他店面的代码，不会修改到其他页面上的代码）
 *      目前，我们所说的springboot与springcould（微服务集群）以及我们新接触过的热部署、热加载、热启动能够再生产环境中以非常高效的速度加载添加新加的代码
 */
public class PizzaStore2 implements Factory {

    void orderPizza(String type){
        Pizza pizza = this.createdPizza(type);
        pizza.prepared();
        pizza.make();
        pizza.complate();
    }

    @Override
    public Pizza createdPizza(String type) {
        if (type.equals("vegg")) {
            return new VeggPizza();
        }
        if (type.equals("meet")) {
            return new MeetPizza();
        } else {
            return null;
        }
    }

}
