package com.backend.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.server.service.PuzzleService;

@RestController
@RequestMapping("/api/v1/server")
public class PuzzleController {
	
	private final PuzzleService puzzleService;

    public PuzzleController(PuzzleService puzzleService) {
        this.puzzleService = puzzleService;
    }

    @GetMapping("/puzzle")
    public String getPuzzle() {
        return puzzleService.fetchPuzzle().getQuestion();
    }
	
}
