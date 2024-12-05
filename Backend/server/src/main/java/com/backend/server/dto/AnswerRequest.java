package com.backend.server.dto;

public class AnswerRequest {
    private String answer;
    
    public AnswerRequest() {
		// TODO Auto-generated constructor stub
	}

	public AnswerRequest(String answer) {
		super();
		this.answer = answer;
	}

	// Getter and Setter
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}