package com.backend.server.dto;

public class ValidationResponse {
	
	private boolean status;
	
	public ValidationResponse() {
		// TODO Auto-generated constructor stub
	}

	public ValidationResponse(boolean status) {
		super();
		this.status = status;
	}

	// Getter and Setter
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
