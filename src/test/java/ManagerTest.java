import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void testSalaire() {
		Manager m1 = new Manager(0);
		Manager m2 = new Manager(2);
		Manager m3 = new Manager(10);
		
		assertTrue(m1.salaire() == 1500);
		assertTrue(m2.salaire() == 1700);
		assertTrue(m3.salaire() == 2500);
		
	}

}
