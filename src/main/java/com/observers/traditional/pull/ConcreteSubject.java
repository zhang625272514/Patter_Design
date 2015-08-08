package com.observers.traditional.pull;

/**
 * Created by cheng on 2015/8/8.
 */
public class ConcreteSubject extends Subject {

    private String subjectStatus;

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;

        this.notifyAllObserver();
    }
}
