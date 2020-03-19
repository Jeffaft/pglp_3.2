import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {

	@Test
	public void testSalaire() {
		Employe e = new Employe(2019);
		Employe e2 = new Employe(2020);
		Employe e3 = new Employe(2018);
		assertTrue(e.salaire() == 1520);
		assertTrue(e2.salaire() == 1500);
		assertTrue(e3.salaire() == 1540);
	}

}
