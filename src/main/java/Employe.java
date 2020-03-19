
public class Employe extends allEmploye {
	private int salaire = 1500;
	private int anneeDebut;
	
	public Employe(int annee) {
		anneeDebut = annee;
	}
	
	@Override
	public double salaire() {
		return salaire+(2020-anneeDebut)*20;
	}
}
