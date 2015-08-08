package com.observers.traditional.jdk;

import java.util.Observable;

/**
 * Created by cheng on 2015/8/8.
 */
public class JdkConcreteSubject extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        // 必须先要进行调用
        this.setChanged();
        //
        this.notifyObservers(content);
    }
}
