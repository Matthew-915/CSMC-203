import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	 private GradeBook g1;
	 private GradeBook g2;


	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
        g2 = new GradeBook(5);

        g1.addScore(50);
        g1.addScore(75);

        g2.addScore(90);
        g2.addScore(80);
        g2.addScore(70);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
        g2 = null;
	}

	@Test
	void testGradeBook() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		fail("Not yet implemented");
	}

	@Test
	void testSum() {
		fail("Not yet implemented");
	}

	@Test
	void testMinimum() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalScore() {
		fail("Not yet implemented");
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
