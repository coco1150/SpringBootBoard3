package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


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
	@ManyToOne
	private SiteUser author;
	private LocalDateTime modifyDate;
	@ManyToMany
	Set<SiteUser>voter;
	public Set<SiteUser> getVoter() {
		return voter;
	}
	public void setVoter(Set<SiteUser> voter) {
		this.voter = voter;
	}
	public LocalDateTime getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(LocalDateTime modifyDate) {
		this.modifyDate = modifyDate;
	}
	public SiteUser getAuthor() {
		return author;
	}
	public void setAuthor(SiteUser author) {
		this.author = author;
	}
}
