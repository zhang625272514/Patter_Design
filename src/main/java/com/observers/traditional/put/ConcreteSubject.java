package com.observers.traditional.put;

/**
 * Created by cheng on 2015/8/8.
 */
public class ConcreteSubject extends Subject {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        // 先更新自身的信息，然后通知观察者们
        this.notifyAllObserver(msg);
    }
}
