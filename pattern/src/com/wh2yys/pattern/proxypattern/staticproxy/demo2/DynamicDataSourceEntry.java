package com.wh2yys.pattern.proxypattern.staticproxy.demo2;

/**
 * @ClassName DynamicDataSourceEntry
 * @Description TODO
 * @Author wh2yys
 * @Date 2019/8/22 17:31
 */
public class DynamicDataSourceEntry {
    //默认数据源
    public final static String DEFAULT_SOURCE = null;

    private static final ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry() {
    }

    public static void clear() {
        local.remove();
    }

    public static String get() {
        return local.get();
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_"+year);
    }

}
