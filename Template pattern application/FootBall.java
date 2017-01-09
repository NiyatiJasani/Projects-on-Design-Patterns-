package com.template.pattern;

public class FootBall extends Game {

	@Override
	void initialize() {
System.out.println("FootBall game has intialized, start the game..");		
	}

	@Override
	void startPlay() {
		System.out.println("FootBall game has Started!");
	}

	@Override
	void endPlay() {
		System.out.println("The game has Finished!");
	}

}
