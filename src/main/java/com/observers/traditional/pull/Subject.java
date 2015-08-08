package com.observers.traditional.pull;

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

    public void notifyAllObserver(){
        for (Observer observer : observerList){
            observer.update(this);
        }
    }
}
