package com.got.trivia.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.got.trivia.model.Trivia;

public interface TriviaRepository extends MongoRepository<Trivia, String> {
	List<Trivia> findByQuoteBy(String quoteBy);
}
