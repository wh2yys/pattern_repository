package com.wh2yys.pattern.adapter.objectadapter;

class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5=new PowerAdapter(new AC220());
        dc5.outputDC5v();
    }
}