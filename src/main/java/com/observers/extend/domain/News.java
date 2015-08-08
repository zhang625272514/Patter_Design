package com.observers.extend.domain;

import com.observers.extend.constant.SubjectType;

/**
 * Created by cheng on 2015/8/8.
 */
public class News {

    private SubjectType subjectType;
    private String title;
    private String content;

    public News(){}

    public News(SubjectType subjectType, String title, String content) {
        this.subjectType = subjectType;
        this.title = title;
        this.content = content;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "subjectType=" + subjectType +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
