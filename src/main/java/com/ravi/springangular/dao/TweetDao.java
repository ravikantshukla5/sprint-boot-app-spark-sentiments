package com.ravi.springangular.dao;

import java.util.List;

import com.ravi.springangular.entities.Tweets;

public interface TweetDao{

    void delete(Tweets tweet);

    List<Tweets> findAll();

    Tweets findOne(int id);

    Tweets save(Tweets tweet);
}
