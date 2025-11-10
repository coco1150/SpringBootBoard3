package com.mysite.sbb.answer;

import java.time.LocalDateTime;
import java.util.Set;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;


@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(columnDefinition = "TEXT")
	private String content;
	private LocalDateTime createDate;
	@ManyToOne
	private Question question;
	@ManyToOne
	private SiteUser user;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public SiteUser getUser() {
		return user;
	}
	public void setUser(SiteUser user) {
		this.user = user;
	}
	public void setAuthor(SiteUser author) {
		// TODO Auto-generated method stub
		
	}
	public SiteUser getAuthor() {
		// TODO Auto-generated method stub
		return user;
	}

	
}
