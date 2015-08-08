package com.observers.traditional.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cheng on 2015/8/8.
 */
public class JdkConcreteObserver implements Observer {

    private String observerName;

    @Override
    public void update(Observable observable, Object o) {

        // 推模式
        System.out.println(observerName + "接收到了推送过来的消息，消息的内容为：" + o);

        // 拉模式
        System.out.println(observerName + "获取到拉了过来的信息，消息内容为：" + ((JdkConcreteSubject)observable).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
