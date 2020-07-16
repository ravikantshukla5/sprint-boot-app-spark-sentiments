package com.ravi.springangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.springangular.entities.Tweets;
import com.ravi.springangular.service.TweetsService;
//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api/tweets"})
public class TweetsController {
	
	 @Autowired
	 private TweetsService tweetService;

	    @PostMapping
	    public Tweets create(@RequestBody Tweets Tweets){
	        return tweetService.create(Tweets);
	    }

	    @GetMapping(path = {"/{id}"})
	    public Tweets findOne(@PathVariable("id") int id){
	        return tweetService.findById(id);
	    }

	    @PutMapping
	    public Tweets update(@RequestBody Tweets Tweets){
	        return tweetService.update(Tweets);
	    }

	    @DeleteMapping(path ={"/{id}"})
	    public Tweets delete(@PathVariable("id") int id) {
	    	Tweets tweet = new Tweets();
	    	tweet.setId(id);
	    	tweetService.delete(tweet);
	        return null;
	    }

	    @SuppressWarnings("rawtypes")
		@GetMapping
	    public List findAll(){
	        return tweetService.findAll();
	    }
	    
	    @SuppressWarnings("rawtypes")
		@GetMapping(path = {"/matD"})
	    public List findAllMatTable(){
	        return tweetService.findAll();
	    }
	    @SuppressWarnings("rawtypes")
		@GetMapping(path = {"/filter"})
	    public List findAllMatTableFilter(){
	        return tweetService.findAll();
	    }

}
