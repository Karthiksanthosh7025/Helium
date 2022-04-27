package DefaultPackage;

import java.util.Scanner;
import static DefaultPackage.BookingApplication.bookings;
import static DefaultPackage.BookingApplication.exercises;

public class Booking {
	private String bookingId;
    private String lessonName;
    private String lessonDate;
    private String bookingStatus;
    private String review;
    private int rating;
   // private int capacity;


    public String getBookingId() {
        return bookingId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getLessonDate() {
        return lessonDate;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
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
        this.bookingId = id;
        this.lessonName = lessonName;
        this.lessonDate = date;
        this.bookingStatus = status;
        this.review = rev;
        this.rating = ratings;
//        this.capacity = cap;
    }


    Scanner scanner = new Scanner(System.in);

    public void bookingDetails(){
            System.out.println("Booking Id:"+bookingId+"    Exercise name: " + lessonName + "    Date: " + lessonDate + "         Booking Status: " + bookingStatus);
    }
    public void changeBooking(String id){
    }
    public void cancelBooking(String id, Booking b) {
    }

    public void attendLesson(String id){
        if(bookingId.equals(id)){
            bookingStatus = "attended";
            System.out.println("Booking ID:" + bookingId +"   Booking Status:" + bookingStatus);
        }
    }
}
