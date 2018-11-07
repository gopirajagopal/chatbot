package com.gopi.chatbot.model;

import java.util.UUID;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
@Table
public class Knowledge {

	@PrimaryKey
	private UUID qid;
	public UUID getId() {
		return qid;
	}
	public void setId(UUID qid) {
		this.qid = qid;
	}
	public long getOrgid() {
		return orgid;
	}
	public void setOrgid(long orgid) {
		this.orgid = orgid;
	}
	public long getRepetition() {
		return repetition;
	}
	public void setRepetition(long repetition) {
		this.repetition = repetition;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	private long orgid;
	private long repetition;
	private String question;
}
