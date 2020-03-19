
public class Vendeur extends allEmploye {
	private int salaire = 1500;
	private int commission;
	
	public Vendeur(int c) {
		commission = c;
	}
	
	@Override
	public double salaire() {
		return salaire+commission;
	}
}
