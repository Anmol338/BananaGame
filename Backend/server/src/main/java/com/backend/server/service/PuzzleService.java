package com.backend.server.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backend.server.model.Puzzle;

@Service
public class PuzzleService {
	
	private static final String API_URL = "https://marcconrad.com/uob/banana/api.php?out=json";

    private final RestTemplate restTemplate;
    
    // Create a new Puzzle object and set its properties
    Puzzle puzzle = new Puzzle();

    public PuzzleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Puzzle fetchPuzzle() {
        try {
            String response = restTemplate.getForObject(API_URL, String.class);
            JSONObject jsonObject = new JSONObject(response);
            
            puzzle.setQuestion(jsonObject.getString("question"));
            puzzle.setSolution(jsonObject.getInt("solution"));
            return puzzle;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	
    // Validate the user's answer
    public boolean validateAnswer(String userAnswer) {
        // Compare the user's answer with the solution
    	return userAnswer != null && userAnswer.equals(String.valueOf(puzzle.getSolution()));
    }
}
