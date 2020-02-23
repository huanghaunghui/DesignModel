package template.template.service.impl;

import template.template.service.AbstractClass;

/**
 * @author hhh
 * @date 2020/2/23 11:40
 * @Despriction
 */
public class CodeBicycle implements AbstractClass {

  /**
   * 默认需要开锁
   */
  static boolean NEED_LOCK = true;

  @Override
  public void unlock() {
    System.out.println("========" + "扫码开锁" + "========");
  }

  @Override
  public void ride() {
    System.out.println(getClass().getSimpleName() + "骑起来很拉风");
  }
}
