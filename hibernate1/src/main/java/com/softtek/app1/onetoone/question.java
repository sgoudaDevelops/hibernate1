package com.softtek.app1.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class question
{
	@Id
	@Column(name="q_id")
	private int qid;
	
	private String Question;
	
	@OneToOne(mappedBy = "Question")
	//@JoinColumn(name="a_id")
	private answer Answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public answer getAnswer() {
		return Answer;
	}

	public void setAnswer(answer answer) {
		Answer = answer;
	}



	
	

}
