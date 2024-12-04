package com.backend.server.model;

public class Puzzle {
	
	private String question; // URL to the image
    private int solution;    // The solution

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }

}
