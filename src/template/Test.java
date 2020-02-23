package template;

import template.template.service.impl.CodeBicycle;
import template.template.service.impl.ScanBicycle;

/**
 * @author hhh
 * @date 2020/2/23 11:30
 * @Despriction use方法的实现是一样的，代码重复
 */
public class Test {
  public static void main(String[] args) {
//    ScanBicycle scanBicycle = new ScanBicycle();
//    scanBicycle.use();
//    System.out.println("========================");
//    CodeBicycle codeBicycle = new CodeBicycle();
//    codeBicycle.use();


    ScanBicycle scanBicycle = new ScanBicycle();
    scanBicycle.use(true);

    CodeBicycle codeBicycle = new CodeBicycle();
    codeBicycle.use(false);
  }
}
