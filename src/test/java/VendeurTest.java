import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void testSalaire() {
		Vendeur v1 = new Vendeur(0);
		Vendeur v2 = new Vendeur(600);
		Vendeur v3 = new Vendeur(100);
		
		assertTrue(v1.salaire() == 1500);
		assertTrue(v2.salaire() == 2100);
		assertTrue(v3.salaire() == 1600);
	}

}
