package test;

import model.Adresse;
import model.Boutique;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console c= new Console("Xbox");
		Adresse a = new Adresse("2","rue","abcd");
		Boutique b = new Boutique("fnac",a);
		Jeu j1= new Jeu("Warzone", c, b);
		Jeu j2= new Jeu("Pokemon", c, b);
		Jeu j3= new Jeu("Zelda", c,b);
		Jeu j4= new Jeu("Minecraft", c, b);
		Jeu j5= new Jeu("Assasins Screed", c, b);

	}

}
