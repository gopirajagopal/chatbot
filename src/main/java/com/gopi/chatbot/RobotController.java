package com.gopi.chatbot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gopi.chatbot.model.QRequest;

@RestController
@RequestMapping(value = "robot")
public class RobotController {

	
	@RequestMapping(method = RequestMethod.POST, value = "requestanswer", produces = "application/json")
	public String getResponse(QRequest request ) {
		
		return "hello";
	}

}