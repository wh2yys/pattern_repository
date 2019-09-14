package com.wh2yys.pattern.adapter.loginadapter;

class PassportForThidrAdapterTest {
    public static void main(String[] args) {
        IPassportForThird passport=new PassportForThidrAdapter();
        passport.loginForQQ("");
    }

}