package template.routine.service;

/**
 * @author hhh
 * @date 2020/2/23 11:25
 * @Despriction 共享单车使用流程的实现
 */
public interface AbstractClass {
  /**
   * 开锁
   */
  void unlock();

  /**
   * 骑行
   */
  void ride();

  /**
   * 上锁
   */
  void lock();

  /**
   * 支付
   */
  void pay();

  /**
   * 使用
   */
  void use();
}
