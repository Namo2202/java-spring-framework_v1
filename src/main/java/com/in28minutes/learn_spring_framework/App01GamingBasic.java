package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacManGame;
import com.in28minutes.learn_spring_framework.game.SuperContra;

public class App01GamingBasic {

	public static void main(String[] args) {
		var game = new MarioGame();
		var game2 = new SuperContra();
		var game3 = new PacManGame();
		var gameRunner = new GameRunner(game3);
		gameRunner.run();
	}

}
