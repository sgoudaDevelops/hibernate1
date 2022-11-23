package com.softtek.app1.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class question
{
	@Id
	private int q_id;
	private String Question;
	@OneToMany(mappedBy = "Question")
    private List<answer> answer;
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public List<answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<answer> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "question [q_id=" + q_id + ", Question=" + Question + ", answer=" + answer + "]";
	}
    
    

}
