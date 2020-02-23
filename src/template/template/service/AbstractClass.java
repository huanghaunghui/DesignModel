package template.template.service;

/**
 * @author hhh
 * @date 2020/2/23 11:33
 * @Despriction
 */
public interface AbstractClass {
  /**
   * 基本方法，子类需要实现
   */
  void unlock();

  /**
   * 基本方法，子类需要实现
   */
  void ride();

  /**
   * 模板方法，负责调度基本方法，子类不可实现
   */
  default void use(Boolean isNeedUnlock) {
    if (isNeedUnlock) {
      unlock();
    } else {
      System.out.println("========锁坏了，不用解锁========");
    }
    ride();
  }
}
