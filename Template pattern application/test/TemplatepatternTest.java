package com.template.pattern.test;


import com.template.pattern.Cricket;
import com.template.pattern.FootBall;
import com.template.pattern.Game;

public class TemplatepatternTest {

	public static void main(String[] args) {
		 Game game= new Cricket();
		 game.play();
			
		System.out.println("-------------------------------");
		game= new FootBall();
		game.play();

	}

}
