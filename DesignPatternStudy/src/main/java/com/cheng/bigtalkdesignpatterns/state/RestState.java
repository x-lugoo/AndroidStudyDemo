package com.cheng.bigtalkdesignpatterns.state;

/**
 * Created by Administrator on 2015/12/21.
 */
public class RestState extends State {

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点， 下班回家了");
    }
}
