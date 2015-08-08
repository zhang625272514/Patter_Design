package com.observers.extend.constant;

/**
 * Created by cheng on 2015/8/8.
 */
public enum SubjectType {
    IT("it"), INTERNET("internet"), EDUCATON("education");
    private String type;
    private SubjectType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
