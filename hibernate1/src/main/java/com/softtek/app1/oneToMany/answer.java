package com.softtek.app1.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;


@Entity
public class answer {
	@Id
	private int a_id;
	private String Answer;
	@ManyToOne
	private question Question;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
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

	@Override
	public String toString() {
		return "answer [a_id=" + a_id + ", Answer=" + Answer + ", Question=" + Question + "]";
	}

}
