package examen14;

public class ConditionAge implements ConditionAcces{
	private int AgeMin;
	public ConditionAge(int AgeMin) {
		this.AgeMin=AgeMin;
	}
	public boolean accesPossible(Personne p) {
		if(p.getAge()>AgeMin) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
