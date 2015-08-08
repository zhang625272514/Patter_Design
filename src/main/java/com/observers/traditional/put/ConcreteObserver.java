package com.observers.traditional.put;

/**
 * Created by cheng on 2015/8/8.
 */
public class ConcreteObserver implements Observer {

    private String subjectName;
    private String subjectContent;

    @Override
    public void update(String content) {
        subjectContent = content;
        System.out.println(subjectName + "|" + subjectContent);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectContent() {
        return subjectContent;
    }

    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent;
    }
}
