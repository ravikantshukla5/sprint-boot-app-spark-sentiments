package com.ravi.springangular.service;

import java.util.List;

import com.ravi.springangular.entities.Tweets;

public interface TweetsService {
	
    public Tweets create(Tweets tweet) ;
    
    public void  delete(Tweets tweet);
    
    @SuppressWarnings("rawtypes")
	public List findAll() ;

    public Tweets  findById(int id);
    
    public Tweets  update(Tweets tweet);

}
