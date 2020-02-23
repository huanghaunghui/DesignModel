package template.template.service.impl;

import template.template.service.AbstractClass;

/**
 * @author hhh
 * @date 2020/2/23 11:39
 * @Despriction
 */
public class ScanBicycle implements AbstractClass {
  @Override
  public void unlock() {
    System.out.println("========" + "密码开锁" + "========");
  }

  @Override
  public void ride() {
    System.out.println(getClass().getSimpleName() + "骑起来很拉风");
  }
}
