package com.wh2yys.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wh
 * @description
 * @date 2019/9/11
 */
public class Leader implements IEmployee {
    private Map<String,IEmployee> targets=new HashMap<>();

    public Leader() {
        targets.put("加密",new EmployeeA());
        targets.put("架构",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
