package com.observers.extend.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheng on 2015/8/8.
 */
public abstract class NewsSubject {

    public List<NewsObserver> newsObserverList = new ArrayList<NewsObserver>();

    public void addNewsObserver(NewsObserver newsObserver){
        this.newsObserverList.add(newsObserver);
    }

    public void removeObserver(NewsObserver newsObserver){
        this.newsObserverList.remove(newsObserver);
    }

    public abstract  void notifyObserver();
}
