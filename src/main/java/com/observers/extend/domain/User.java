package com.observers.extend.domain;

import com.observers.extend.constant.SubjectType;

import java.util.List;

/**
 * Created by cheng on 2015/8/8.
 */
public class User {
    private String userName;
    private List<SubjectType> subjectTypes;

    public User(){}

    public User(String userName, List<SubjectType> subjectTypes) {
        this.userName = userName;
        this.subjectTypes = subjectTypes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SubjectType> getSubjectTypes() {
        return subjectTypes;
    }

    public void setSubjectTypes(List<SubjectType> subjectTypes) {
        this.subjectTypes = subjectTypes;
    }

    public void addSubjectType(SubjectType subjectType){
        this.subjectTypes.add(subjectType);
    }

    public void removeSubjectType(SubjectType subjectType){
        this.subjectTypes.remove(subjectType);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", subjectTypes=" + subjectTypes +
                '}';
    }
}
