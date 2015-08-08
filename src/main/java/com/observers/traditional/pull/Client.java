package com.observers.traditional.pull;

/**
 * Created by cheng on 2015/8/8.
 */
public class Client {

    public static void main(String []args){
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setSubjectStatus("prcess");
    }
}
