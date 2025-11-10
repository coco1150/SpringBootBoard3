package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;

public class AnswerForm {
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@NotEmpty(message="내용은 필수입니다")
	private String content;
}
