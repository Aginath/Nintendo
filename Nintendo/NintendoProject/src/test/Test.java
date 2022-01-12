package test;

import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c= new Console("Xbox");
		Jeu j1= new Jeu("Warzone", c);
		Jeu j2= new Jeu("Pokemon", c);
		Jeu j3= new Jeu("Zelda", c);
		Jeu j4= new Jeu("Minecraft", c);
		Jeu j5= new Jeu("Assasins Screed", c);

	}

}
