package com.ravi.springangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.springangular.dao.TweetDao;
import com.ravi.springangular.entities.Tweets;

@Service
public class TweetServiceImpl implements TweetsService {
    
	@Autowired
	TweetDao tweetDao;
	@Override
	public Tweets create(Tweets tweet) {
		return tweetDao.save(tweet);
	}

	@Override
	public void delete(Tweets tweet) {
		tweetDao.delete(tweet);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll() {
		return tweetDao.findAll();
	}

	@Override
	public Tweets findById(int id) {
		return tweetDao.findOne(id);
	}

	@Override
	public Tweets update(Tweets tweet) {
		// TODO Auto-generated method stub
		return null;
	}

}
