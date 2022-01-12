package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
		private String nom;
		private String prenom;
		private List<Achat> matchs=new ArrayList();
		

		public List<Achat> getMatchs() {
			return matchs;
		}


		public void setMatchs(List<Achat> matchs) {
			this.matchs = matchs;
		}


		public Client(String nom, String prenom, List<Achat> matchs) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.matchs = matchs;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		@Override
		public String toString() {
			return "Client [nom=" + nom + ", prenom=" + prenom + ", matchs=" + matchs + "]";
		}



		
		

}
