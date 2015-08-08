package com.observers.extend.biz;

import com.observers.extend.domain.News;
import com.observers.extend.domain.User;

import java.util.List;

/**
 * Created by cheng on 2015/8/8.
 */
public class ConcreteNewsObserver implements NewsObserver {

    private User user;

    @Override
    public void update(News news) {
            System.out.println(news.getSubjectType().getType() + "|" + news.getTitle() + "|" + news.getContent());
    }

    @Override
    public void setOserverUser(User user) {
         this.user = user;
    }

    @Override
    public User getObserverUser() {
        return user;
    }
}
