package DefaultPackage;

import java.util.Scanner;
import static DefaultPackage.BookingApplication.bookings;
import static DefaultPackage.BookingApplication.exercises;

public class Booking {
	private String hertsBookingId;
    private String exerciseLessonName;
    private String exerciseLessonDate;
    private String bookingStatus;
    private String review;
    private int rating;


    public String getBookingId() {
        return hertsBookingId;
    }

    public String getLessonName() {
        return exerciseLessonName;
    }

    public String getLessonDate() {
        return exerciseLessonDate;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingId(String bookingId) {
        this.hertsBookingId = bookingId;
    }

    public void setLessonName(String lessonName) {
        this.exerciseLessonName = lessonName;
    }

    public void setLessonDate(String lessonDate) {
        this.exerciseLessonDate = lessonDate;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //REMOVED int cap FROM BELOW PARAMETERIZED CONSTRUCTOR
    Booking(String id, String lessonName, String date, String status, String rev, int ratings){
        this.hertsBookingId = id;
        this.exerciseLessonName = lessonName;
        this.exerciseLessonDate = date;
        this.bookingStatus = status;
        this.review = rev;
        this.rating = ratings;
//        this.capacity = cap;
    }


    Scanner scanner = new Scanner(System.in);

    public void bookingDetails(){
            System.out.println("Booking Id:"+hertsBookingId+"    Exercise name: " + exerciseLessonName + "    Date: " + exerciseLessonDate + "         Booking Status: " + bookingStatus);
    }
//    public void changeBooking(String id){
//    }
//    public void cancelBooking(String id, Booking b) {
//    }

    public void attendASession(String id){
        if(hertsBookingId.equals(id)){
            bookingStatus = "attended";
            System.out.println("Booking ID:" + hertsBookingId +"   New Booking Status:" + bookingStatus);
        }
    }
}
