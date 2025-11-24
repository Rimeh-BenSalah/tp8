package examen14;

public class Test {

	public static void main(String[] args) {
		ParcAttraction p=new ParcAttraction("a",8);
		
		
		ConditionAge c=new ConditionAge(12);
		ConditionAge c1=new ConditionAge(20);
		
		
		Attraction a= new Attraction("aa",12,c);
		Attraction a1= new Attraction("bb",15,c1);
		 
		Personne p1=new Personne(13,163,"riri");
		Personne p2=new Personne(22,156,"mimi");
		
		 try {
	            a.utilise(p1);
	            a1.utilise(p2); 
	            a1.utilise(p1); 
	        } 
		 catch (AccesInterditException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }	
		p.ajouteAttraction(a);
		p.ajouteAttraction(a1);
		
		System.out.println(p.getRecette1());
		p.affiche();
		
	}

}
