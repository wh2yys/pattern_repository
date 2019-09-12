package com.wh2yys.pattern.delegate;

/**
 * @author wh
 * @description 1
 * @date 2019/9/11
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
