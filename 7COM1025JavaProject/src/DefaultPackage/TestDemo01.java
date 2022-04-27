package DefaultPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDemo01 {

	@Test
	public void test01() {
		Exercise demo = new Exercise("Yoga","morning","01-01-2022",1,20);
		String expLesson = "Yoga";
		String result = demo.getLessonName();
		assertEquals(expLesson, result);
	}
	
	@Test
	public void test02() {
		Booking demo = new Booking("hert6753","basketball","01-01-2022","attended",3);
		String expBookingID = "hert6753";
		String result = demo.getBookingId();
		assertEquals(expBookingID, result);
	}
	

}
