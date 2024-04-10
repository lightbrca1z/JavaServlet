import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import refact.MonthCheck;

class PracticeJava_Calc_6_3Test {

	@Test
	void test() {
		int days = 1;
		days = PracticeJava_Calc_6_3.chkDays(2023,1);
		assertEquals(31, days);
		
		int number2 = 0;
		number2 = MonthCheck.number(3);
		assertEquals(3, number2);
		
		assertNull(MonthCheck.nullValue());
//		assertNotNull(MonthCheck.nullValue());
		
		assertTrue(MonthCheck.trueValue());
//		assertTrue(MonthCheck.falseValue());
	}

}
