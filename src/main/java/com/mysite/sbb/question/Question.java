package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import com.mysite.sbb.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;


@Entity
public class Question {
	public void setId(Integer id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public void setAnswerList(List<Answer> answerList) {
		this.answerList = answerList;
	}
	public Integer getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public List<Answer> getAnswerList() {
		return answerList;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(length = 200)
	private String subject;
	@Column(columnDefinition = "TEXT")
	private String content;
	private LocalDateTime createDate;
	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
}
