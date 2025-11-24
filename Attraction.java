package examen14;

public class Attraction {
	private String nom;
	private float cout;
	private ConditionAge condition;
	private int nombre=0;
	private float recette=0;
	public Attraction(String nom,float cout,ConditionAge condition) {
		this.nom=nom;
		this.cout=cout;
		this.condition=condition;
	}
	public void affiche() {
		System.out.println("nom :"+nom+" "+"recette :"+recette);
	}
	public float getRecette() {
		return recette;
	}
	/*public void utilise(Personne p) {
		if(condition.accesPossible(p)) {
			recette+=cout;
			nombre++;
		}
		else {
			System.out.println("erreur");
		}
	}*/
	public void utilise(Personne p) throws AccesInterditException {
        if (!condition.accesPossible(p)) {
            throw new AccesInterditException("Accès interdit pour " + p.getNom() + " à l'attraction " + nom);
        }
        nombre++;
        recette += cout;
    }
	
}
