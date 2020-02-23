package template.routine.service.impl;

import template.routine.service.AbstractClass;

/**
 * @author hhh
 * @date 2020/2/23 11:29
 * @Despriction 常规实现
 */
public class CodeBicycle implements AbstractClass {
  @Override
  public void unlock() {
    System.out.println("密码开锁");
  }

  @Override
  public void ride() {
    System.out.println("骑起来很拉风");
  }

  @Override
  public void lock() {
    System.out.println("上锁");
  }

  @Override
  public void pay() {
    System.out.println("结算");
  }

  @Override
  public void use() {
    unlock();
    ride();
    lock();
    pay();
  }
}
