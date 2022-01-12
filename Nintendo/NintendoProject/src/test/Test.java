package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;
import model.Salon;

public class Test {

public static void main(String[] args) {
	Adresse a= new Adresse("52","rue St-Honor�","Paris");
	Boutique b1= new Boutique ("Maximania",a);
	Console c= new Salon("Xbox",500,LocalDate.parse("2015-07-06"));

	Jeu j1= new Jeu("Warzone", c, b1);
	Jeu j2= new Jeu("Pokemon", c, b1);
	Jeu j3= new Jeu("Zelda", c, b1);
	Jeu j4= new Jeu("Minecraft", c, b1);
	Jeu j5= new Jeu("Assasins Screed", c, b1);

	Achat a1= new Achat(j1, LocalDate.parse("2022-01-12"), 1.5);
	Achat a2= new Achat(j2, LocalDate.parse("2022-01-12"), 2.5);
	Achat a3= new Achat(j3, LocalDate.parse("2022-01-12"), 3.5);
	List<Achat> client1 = new ArrayList();
	client1.add(a1);
	client1.add(a2);
	
	List<Achat> client2= new ArrayList();
	client2.add(a3);

	Client c1= new Client("John","cena", client1);
	Client c2= new Client("Jane","sarah", client2);
	
	System.out.println(c1);
	System.out.println(c2);
	

	}

}
