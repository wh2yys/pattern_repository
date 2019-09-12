package com.wh2yys.pattern.delegate;

class BossTest {
    public static void main(String[] args) {
        new Boss().command("架构",new Leader());

    }
}