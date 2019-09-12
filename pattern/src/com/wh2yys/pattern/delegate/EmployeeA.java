package com.wh2yys.pattern.delegate;

/**
 * @author wh
 * @description 1
 * @date 2019/9/11
 */
public class EmployeeA  implements IEmployee{


    @Override
    public void doing(String command) {
        System.out.println("我是A，我现在开始干"+command+"工作");
    }
}
