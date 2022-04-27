package DefaultPackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static DefaultPackage.BookingApplication.bookings;

public class Exercise {
	private String className;
    private int capacity;
    private String session;
    private String date;
    private int cost;


    public String getLessonName() {
        return className;
    }

    public void setLessonName(String lessonName) {
        this.className = lessonName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setPrice(int price) {
        this.cost = price;
    }

    Exercise(String lessname, String sess, String day, int cap, int rate){
        this.className = lessname;
        this.session = sess;
        this.date = day;
        this.capacity = cap;
        this.cost = rate;
    }



    public void detailsOfClass(){
        if(capacity > 0){
            System.out.println("Exercise name: " + className + "     Session: " + session + "     Date: " + date + "     Number of slots: " + capacity + "     Fees: " + cost);
        }
    }

    public void displayClassDetailsByDate(String inputDate){
        if(date.equals(inputDate)) {
            System.out.println("Exercise name: " + className + "     Session: " + session + "     Date: " + date + "     Number of slots: " + capacity + "     Fees: " + cost);
        }
}
    public void displayDetailsByClassName(String className){
        if(className.equals(className)){
            System.out.println("Exercise name: " + className + "     Session: " + session + "     Date: " + date + "     Number of slots: " + capacity + "     Fees: " + cost);
        }
    }

    //ArrayList<Booking> bookings = new ArrayList<>();
   // Booking booking = new Booking();
    public void confirmBooking(String userLesson, String userDate, String userBookingId){
        if(userBookingId == null){
            if(className.equals(userLesson) && date.equals(userDate) && capacity > 0){
                int rand = ThreadLocalRandom.current().nextInt(11111,99999);
                String bookingId = "LM" + rand;
                String bookingStatus = "booked";
                this.capacity--;

                bookings.add(new Booking(bookingId,className,date,bookingStatus,bookingStatus, capacity));

                System.out.println("Booking Success with Booking ID:" + bookingId);

            }
            else if(capacity == 0){
                System.out.println("Session is full, please select another date or class");
            }
        }
        else if(userBookingId!=null){
            if(className.equals(userLesson) && date.equals(userDate) && capacity > 0){
                this.capacity--;
                System.out.println("Booking changed for Booking ID:" + userBookingId);
            }
            else if(className.equals(userLesson) && date.equals(userDate) && capacity == 0){
                System.out.println("Session is full, please select another date or class");
            }
        }

    }
}
