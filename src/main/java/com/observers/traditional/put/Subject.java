package com.observers.traditional.put;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheng on 2015/8/8.
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer){

        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     * @param content  需要通知的内容
     */
    public void notifyAllObserver(String content){
        for(Observer observer : observerList){
            observer.update(content);
        }
    }
}
