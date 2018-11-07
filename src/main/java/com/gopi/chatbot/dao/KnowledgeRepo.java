package com.gopi.chatbot.dao;

import org.springframework.data.repository.CrudRepository;

import com.gopi.chatbot.model.Knowledge;


public interface KnowledgeRepo extends CrudRepository<Knowledge	, String>{

}
