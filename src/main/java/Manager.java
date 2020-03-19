
public class Manager extends allEmploye{
	private int salaire = 1500;
	private int nbEmploye;
	
	public Manager(int nb) {
		nbEmploye = nb;
	}
	
	@Override
	public double salaire() {
		return salaire+100*nbEmploye;
	}
}
