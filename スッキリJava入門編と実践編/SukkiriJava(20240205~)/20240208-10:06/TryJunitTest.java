import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TryJunitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAllです！");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAllです！");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEachです！");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEachです！");
	}

	@Test
	void testTryJunit() {
		System.out.println("Test1！");
	}
	
	
	@Test
	void test() {
		System.out.println("Test2！");
	}

}
