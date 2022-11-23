package com.softtek.app1.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class answer
{
	@Id
	@Column(name="a_id")
	private int aid;
	private String Answer;
	//@OneToOne(mappedBy = "Answer")
	//@JoinColumn(name="q_id")
	@OneToOne
	private question Question;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public question getQuestion() {
		return Question;
	}
	public void setQuestion(question question) {
		Question = question;
	}
	
	
	
	
	
	

}
