package model;

import java.time.LocalDate;

public class Achat {
	private Jeu j;
	private LocalDate date;
	private Double prix;
	
	public Jeu getJ() {
		return j;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getPrix() {
		return prix;
	}

	public void setJ(Jeu j) {
		this.j = j;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Achat(Jeu j, LocalDate date, Double prix) {
		super();
		this.j = j;
		this.date = date;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [j=" + j + ", date=" + date + ", prix=" + prix + "]";
	}
	
	
}
