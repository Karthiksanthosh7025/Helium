package DefaultPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestDemo01 {
	Exercise demo = new Exercise("Yoga","morning","01-01-2022",1,5);
	
	@Test
	public void testLessonName() {
		String expLesson = "Yoga";
		String result = demo.getLessonName();
		assertEquals(expLesson, result);
	}
	
//	@Test
//	public void test02() {
//		Booking demo = new Booking("hert6753","basketball","01-01-2022","attended",3);
//		String expBookingID = "hert6753";
//		String result = demo.getBookingId();
//		assertEquals(expBookingID, result);
//	}
	
	@Test
	public void testLessonSession() {
		String expSession = "morning";
		String result = demo.getSession();
		assertEquals(expSession, result);
	}
	
	@Test
	public void testDate() {
		String expDate = "01-01-2022";
		String result = demo.getDate();
		assertEquals(expDate, result);
	}
	
	@Test
	public void testCapacity() {
		int expCap = 1;
		int result = demo.getCapacity();
		assertEquals(expCap, result);
	}
	
	@Test
	public void testPrice() {
		int expPrice = 5;
		int result = demo.getPrice();
		assertEquals(expPrice, result);
	}

}
