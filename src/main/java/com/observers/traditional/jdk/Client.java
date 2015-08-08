package com.observers.traditional.jdk;

/**
 * Created by cheng on 2015/8/8.
 */
public class Client {
    public static void main(String[] args) {
        JdkConcreteSubject subject = new JdkConcreteSubject();

        JdkConcreteObserver o1 = new JdkConcreteObserver();
        o1.setObserverName("tom");

        JdkConcreteObserver o2 = new JdkConcreteObserver();
        o2.setObserverName("jim");

        subject.addObserver(o1);
        subject.addObserver(o2);

        subject.setContent("today is fun");
    }
}
