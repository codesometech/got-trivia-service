package com.got.trivia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.got.trivia.model.Trivia;
import com.got.trivia.repository.TriviaRepository;

@RestController
public class TriviaController {
	
	@Autowired
	private TriviaRepository quotesRepository;
	
	@GetMapping(path="/quotes")
	public List<Trivia> getAllQuotes() {
		return quotesRepository.findAll();
	}
	
	@GetMapping(path="/quotes/{user}")
	public List<Trivia> getAllQuotesByUser(@PathVariable String user) {
		return quotesRepository.findByQuoteBy(user);
	}
	
	@PostMapping(path="/quotes", consumes="application/json")
	public void saveQuote(@RequestBody Trivia quote) {
		quotesRepository.save(quote);
	}
	
}
