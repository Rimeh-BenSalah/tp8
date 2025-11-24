package examen14;

public class ParcAttraction {
	private Attraction[] lesAttractions;
	private int taille;
	private int nb;
	private String nom;
	public ParcAttraction(String nom, int taille) {
		this.nom=nom;
		lesAttractions=new Attraction[taille];
		this.nb=0;
	}
	public void ajouteAttraction (Attraction a) {
		if(nb<taille) {
			System.out.println("erreur");
		}
		else {
			lesAttractions[nb++]=a;
		}}
	public float getRecette1() {
		float s=0;
		for(int i=0;i<nb;i++) {
			s+=lesAttractions[i].getRecette();
		}
		return s;
	}
	public void affiche() {
		System.out.println("nom :"+nom);
		for(int i=0;i<nb;i++) {
			lesAttractions[i].affiche();
		}
	}
	
}
