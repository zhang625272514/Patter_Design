package com.observers.traditional.pull;

/**
 * Created by cheng on 2015/8/8.
 */
public class ConcreteObserver implements Observer {

    private String observerStatus = "init";

    @Override
    public void update(Subject subject) {
        System.out.println(this.getClass().getName() + "，before update, observerStatus:" + observerStatus);
        this.observerStatus = ((ConcreteSubject)subject).getSubjectStatus();

        System.out.println(this.getClass().getName() + "，after update, observerStatus:" +  observerStatus);
    }
}
