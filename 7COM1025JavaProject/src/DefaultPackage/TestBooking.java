package DefaultPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBooking {
	
	Booking demo = new Booking("hert6753","basketball","01-01-2022","attended",3);

	@Test
	public void testBookingId() {
		String expBookingID = "hert6753";
		String result = demo.getBookingId();
		assertEquals(expBookingID, result);
	}
	
	@Test
	public void testBookedExercise() {
		String expExercise = "basketball";
		String result = demo.getLessonName();
		assertEquals(expExercise, result);
	}
	
	@Test
	public void testBookedDate() {
		String expDate = "01-01-2022";
		String result = demo.getLessonDate();
		assertEquals(expDate, result);
	}
	
	@Test
	public void testBookingStatus() {
		String expStatus = "attended";
		String result = demo.getBookingStatus();
		assertEquals(expStatus, result);
	}
}
	
	

