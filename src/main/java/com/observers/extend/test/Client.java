package com.observers.extend.test;

import com.observers.extend.biz.ConcreteNewsObserver;
import com.observers.extend.biz.ConcreteNewsSubject;
import com.observers.extend.constant.SubjectType;
import com.observers.extend.domain.News;
import com.observers.extend.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cheng on 2015/8/8.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteNewsSubject subjects = new ConcreteNewsSubject();
        News itNew = new News(SubjectType.IT,
                "JDK9发布了",
                "Oracle 公司于2020年发布JDK9，引起行业内的关注");
        News educationNews = new News(SubjectType.EDUCATON,
                "新东方市值又创新高",
                "新东方的市值超过900亿美金");
        News internetNews = new News(SubjectType.INTERNET,
                "因特尔处理器100核研发上市",
                "因特尔处理器在不到三厘米的芯片上集成100核，标志进入新的计算世界");
        List<News> newses = new ArrayList<News>();
        newses.add(itNew);
        newses.add(educationNews);
        newses.add(internetNews);
        subjects.setNews(newses);


        ConcreteNewsObserver o1 = new ConcreteNewsObserver();
        List<SubjectType> types = new ArrayList<SubjectType>();
        types.add(SubjectType.INTERNET);
        types.add(SubjectType.IT);
        User tom = new User("tom",types);
        o1.setOserverUser(tom);

        subjects.addNewsObserver(o1);
        subjects.notifyObserver();

        System.out.println("---------------------------------------");
        tom.removeSubjectType(SubjectType.INTERNET);
        subjects.notifyObserver();
    }
}
