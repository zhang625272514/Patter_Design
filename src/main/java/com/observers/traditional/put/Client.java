package com.observers.traditional.put;

/**
 * Created by cheng on 2015/8/8.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer = new ConcreteObserver();
        observer.setSubjectContent("weather");

        ConcreteObserver observer1 = new ConcreteObserver();
        observer1.setSubjectContent("IT");

        subject.addObserver(observer);
        subject.addObserver(observer1);

        subject.setMsg("has been update");
    }
}
