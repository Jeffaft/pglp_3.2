import java.util.List; 
import java.util.ArrayList;

public class CollectionEmploye {
	private List<allEmploye> employeList;
	
	public CollectionEmploye() {
		employeList = new ArrayList<allEmploye>();
	}
	
	public void add(allEmploye e) {
		employeList.add(e);
	}
	
	public void remove(allEmploye e) {
		employeList.remove(e);
	}
	
	public double get_total() {
		double somme = 0;
		for(allEmploye e : employeList) {
			somme = somme + e.salaire();
			System.out.println(e.salaire());
		}
			
		return somme;
	}
}
