package com.observers.extend.biz;

import com.observers.extend.domain.News;
import com.observers.extend.domain.User;

/**
 * Created by cheng on 2015/8/8.
 */
public interface NewsObserver {

    public void update(News news);

    public void setOserverUser(User user);

    public User getObserverUser();
}
