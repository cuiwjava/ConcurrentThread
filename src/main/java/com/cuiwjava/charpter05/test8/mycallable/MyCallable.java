package com.cuiwjava.charpter05.test8.mycallable;

import java.util.concurrent.Callable;

/**
 * @Classname MyCallable
 * @Description TODO
 * @Date 2020/1/6 9:21
 * @Created by cuiwei34
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "我的年龄是100";
    }
}
