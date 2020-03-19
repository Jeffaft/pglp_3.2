

public enum AppSingleton {
	ENVIRONNEMENT;
	public void run(String[]args) {
		Employe e = new Employe(2020);
		Vendeur v = new Vendeur(100);
		Manager m = new Manager(1);
		
		CollectionEmploye c = new CollectionEmploye();
		
		c.add(e);
		c.add(v);
		c.add(m);
		
		System.out.println("Somme des salaires: "+c.get_total());
		
		 
	}
	public static void main(String[]args) {
	ENVIRONNEMENT.run(args);
	}
}
