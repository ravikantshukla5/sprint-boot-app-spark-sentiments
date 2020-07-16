package com.ravi.springangular.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.springangular.entities.Tweets;
@Transactional
@Repository
public class TweetDaoImpl implements TweetDao {
	
	@PersistenceContext	
	private EntityManager entityManager;

	@Override
	@Transactional(readOnly=false)
	public void delete(Tweets tweet) {
		entityManager.remove(findOne(tweet.getId()));

	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Tweets> findAll() {
		Query query = entityManager.createQuery("select t from Tweets t");
		return query.getResultList();
	}

	@Override
	public Tweets findOne(int id) {
		return entityManager.find(Tweets.class, id);
	}

	@Override
	@Transactional(readOnly=false)
	public Tweets save(Tweets tweet) {
		// TODO Auto-generated method stub
		return null;
	}

}
