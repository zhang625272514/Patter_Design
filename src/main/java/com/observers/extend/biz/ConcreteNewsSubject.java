package com.observers.extend.biz;

import com.observers.extend.constant.SubjectType;
import com.observers.extend.domain.News;
import com.observers.extend.domain.User;
import com.observers.traditional.put.Subject;

import java.util.List;

/**
 * Created by cheng on 2015/8/8.
 */
public class ConcreteNewsSubject extends NewsSubject {

    private List<News> news;

    public void notifyObserver() {
        for(News n : news) {
            for (NewsObserver newsObserver : this.newsObserverList) {
                User user = newsObserver.getObserverUser();
                List<SubjectType> subjectTypes = user.getSubjectTypes();
                for (SubjectType $i : subjectTypes) {
                    if (n.getSubjectType().compareTo($i) == 0) {
                        newsObserver.update(n);
                    }
                }
            }
        }
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
