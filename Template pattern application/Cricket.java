package com.template.pattern;

public class Cricket extends Game {

	@Override
	void initialize() {
		System.out.println("Cricket game has intialized, you can start playing...");
	}

	@Override
	void startPlay() {
		System.out.println("The game has begun!");
	}

	@Override
	void endPlay() {
		System.out.println("The game has finsihed");
	}

}
