package test;

<<<<<<< HEAD
import java.time.LocalDate;

import model.Adresse;
import model.Boutique;
import model.Client;
=======
import model.Adresse;
import model.Boutique;
>>>>>>> Agi
import model.Console;
import model.Jeu;
import model.Portable;
import model.Salon;

public class Test {

	public static void main(String[] args) {
<<<<<<< HEAD

		Console c= new Salon("Xbox",500,LocalDate.parse("2015-07-06"));
	
		Jeu j1= new Jeu("Warzone", c);
		Jeu j2= new Jeu("Pokemon", c);
		Jeu j3= new Jeu("Zelda", c);
		Jeu j4= new Jeu("Minecraft", c);
		Jeu j5= new Jeu("Assasins Screed", c);
		
		Adresse a= new Adresse("52","rue St-Honor�","Paris");
		Boutique b1= new Boutique("Maximania",a);
		Client c1= new Client("John","cena");
		Client c2= new Client("Jane","sarah");
=======
		Console c= new Console("Xbox");
		Adresse a = new Adresse("2","rue","abcd");
		Boutique b = new Boutique("fnac",a);
		Jeu j1= new Jeu("Warzone", c, b);
		Jeu j2= new Jeu("Pokemon", c, b);
		Jeu j3= new Jeu("Zelda", c,b);
		Jeu j4= new Jeu("Minecraft", c, b);
		Jeu j5= new Jeu("Assasins Screed", c, b);
>>>>>>> Agi

	}

}
