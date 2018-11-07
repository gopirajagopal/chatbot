package com.gopi.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.chatbot.dao.KnowledgeRepo;
import com.gopi.chatbot.model.Knowledge;
import com.gopi.chatbot.model.QRequest;

@RestController
@RequestMapping(value = "robot")
public class RobotController {

@Autowired
private KnowledgeRepo knowledgerepo;

	@RequestMapping(method = RequestMethod.POST, value = "requestanswer", produces = "application/json")
	public String getResponse(QRequest request ) {
		Knowledge knowledge = new Knowledge();
		knowledge.setId(java.util.UUID.randomUUID());
		knowledge.setQuestion("hello there, what are you looking for today?");
		knowledge.setRepetition(1);
		this.knowledgerepo.save(knowledge);
		return "hello";
	}

}