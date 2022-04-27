package DefaultPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookingApplication {

    static ArrayList<Booking> bookings = new ArrayList<>();
    static  ArrayList<Exercise> exercises = new ArrayList<>();
    static ArrayList<Report> reports = new ArrayList<Report>();
    
    public static void main(String[] args) {
    	

        exercises.add(new Exercise("yoga","Morning","01-01-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","01-01-2022",4,2));
        exercises.add(new Exercise("football","Evening","01-01-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","02-01-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","02-01-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","02-01-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","08-01-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","08-01-2022",4,2));
        exercises.add(new Exercise("football","Evening","08-01-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","09-01-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","09-01-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","09-01-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","15-01-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","15-01-2022",4,2));
        exercises.add(new Exercise("football","Evening","15-01-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","16-01-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","16-01-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","16-01-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","22-01-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","22-01-2022",4,2));
        exercises.add(new Exercise("football","Evening","22-01-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","23-01-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","23-01-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","23-01-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","29-01-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","29-01-2022",4,2));
        exercises.add(new Exercise("football","Evening","29-01-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","30-01-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","30-01-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","30-01-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","05-02-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","05-02-2022",4,2));
        exercises.add(new Exercise("football","Evening","05-02-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","06-02-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","06-02-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","06-02-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","12-02-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","12-02-2022",4,2));
        exercises.add(new Exercise("football","Evening","12-02-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","13-02-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","13-02-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","13-02-2022",4,6));
        exercises.add(new Exercise("yoga","Morning","19-02-2022",4,5));
        exercises.add(new Exercise("swimming","Afternoon","19-02-2022",4,2));
        exercises.add(new Exercise("football","Evening","19-02-2022",4,6));
        exercises.add(new Exercise("cricket","Morning","19-02-2022",4,8));
        exercises.add(new Exercise("boxing","afternoon","19-02-2022",4,10));
        exercises.add(new Exercise("basketball","Evening","19-02-2022",4,6));
        
        bookings.add(new Booking("hert69104","boxing","02-01-2022","attended",2));
    	bookings.add(new Booking("hert69105","cricket","01-01-2022","attended",2));
    	bookings.add(new Booking("hert69106","football","08-01-2022","attended",2));
    	bookings.add(new Booking("hert69107","basketball","08-01-2022","attended",2));
    	bookings.add(new Booking("hert69104","boxing","09-01-2022","attended",2));
    	bookings.add(new Booking("hert69104","swimming","15-01-2022","attended",2));
    	bookings.add(new Booking("hert69104","yoga","05-02-2022","attended",2));
    	bookings.add(new Booking("hert69104","cricket","06-02-2022","attended",2));
    	bookings.add(new Booking("hert69104","boxing","12-02-2022","attended",2));
    	bookings.add(new Booking("hert69104","basketball","13-02-2022","attended",2));

        reports.add(new Report("yoga",0,0,0));
        reports.add(new Report("zumba",0,0,0));
        reports.add(new Report("swimming",0,0,0));
        reports.add(new Report("boxing",0,0,0));


        System.out.println(exercises);
        int userOption;
        int userInput;
        Scanner scanner = new Scanner(System.in);

        //PRINT WHOLE DETAILS OF EACH LESSONS
		/*for(Exercise e:exercises) {
			e.displayExcersizeDetails();
		}*/

       while(true){
           System.out.println("!!!!! Welcome to University Sports Center !!!!! " +
                   "\nEnter '1' for Booking \nEnter '2' for Change Booking " +
                   "\nEnter '3' Attend a Lesson \nEnter '4' for Monthly report \nEnter '5' to Exit");
           userOption = scanner.nextInt();
           if (userOption == 1) {
               for(Booking b:bookings){
                    b.bookingDetails();
               }
               System.out.println("Enter '1' for view by Date \nEnter '2' for view by Lesson");
               userInput = scanner.nextInt();
               if(userInput == 1) {
                   System.out.println("|| BY DATE || \nClasses are scheduled on 'January: 1, 2, 8, 9, 25, 26' || 'February: 1, 2, 8, 9, 25, 26' || 'March: 5, 6, 12, 13'");
                   String userInputDate;
                   System.out.println("Enter a date from above in dd-mm-yyyy");
                   userInputDate = scanner.next();
                   for(Exercise e:exercises) {
                       e.displayDetailsByDate(userInputDate);
                   }
                   System.out.println("Please choose a lesson");
                   String userConfirmedLesson = scanner.next();


                   for(Exercise booking:exercises) {
                       booking.bookConfirmTest01(userConfirmedLesson, userInputDate, null);
                   }}

               else if(userInput == 2) {
                   System.out.println("BY LESSON");
                   String userInputLesson;
                   System.out.println("Enter a Lesson Name");
                   userInputLesson = scanner.next();
                   for (Exercise e : exercises) {
                       e.displayDetailsByClassName(userInputLesson);
                   }
                   System.out.println("Please choose a date in dd-mm-yyyy");
                   String userConfirmedDate = scanner.next();

                   for(Exercise booking:exercises) {
                       booking.bookConfirmTest01(userInputLesson, userConfirmedDate,null);
                   }
               }

           }
           else if (userOption == 2)
           {
               System.out.println("1. Change Booking\n2. Cancel Booking");
               System.out.println("Please Enter Your option: ");
               int choice = scanner.nextInt();
               if(choice == 1){
                   for (Exercise e : exercises) {
                       e.classDetails();
                   }
                   System.out.println("Please Enter your Booking ID: ");
                   String userBookingId = scanner.next();
                   for(Booking b:bookings){
                       b.bookingDetails();
                       if(b.getBookingId().equals(userBookingId)){
                           System.out.println("Booking Details Found\n");
                           System.out.println("Booking ID:" + b.getBookingId() + "\nLesson Name:" + b.getLessonName()
                                   + "\nDate:" + b.getLessonDate() + "\nBooking Status:" + b.getBookingStatus());
                           System.out.println("Are you sure you want to Change the booking (y/n):");
                           String confirmation = scanner.next();
                           if(confirmation.equals("y")){
                               System.out.println("Available Classes are:\n");
                               for (Exercise e : exercises){
                                   e.classDetails();
                               }
                               System.out.println("Enter a date from above in dd-mm-yyyy");
                               String changeDate = scanner.next();
                               System.out.println("Enter the class Name");
                               String changeClass = scanner.next();
                               for (Exercise e : exercises){
                                   e.bookConfirmTest01(changeClass,changeDate,userBookingId);
                                   //  e.setCapacity(lessonName,lessonDate,capacity);
                               }

                               for (Exercise e : exercises) {
                                   if (e.getLessonName().equals(b.getLessonName()) && e.getDate().equals(b.getLessonDate())) {
                                       int cap = e.getCapacity();
                                       cap++;
                                       e.setCapacity(cap);
                                   }
                               }
                               b.setLessonName(changeClass);
                               b.setLessonDate(changeDate);
                           }

                       }
                   }
               }
               else if(choice == 2){
                   for (Exercise e : exercises) {
                       e.classDetails();
                   }
                   System.out.println("Please Enter your Booking ID: ");
                   String userBookingId = scanner.next();
                   Booking bookObj = null;
                   for(Booking b:bookings){
                       b.bookingDetails();
                       if(b.getBookingId().equals(userBookingId)){
                           bookObj = b;
                           System.out.println("Booking Details Found\n");
                           System.out.println("Booking ID:" + b.getBookingId() + "\nLesson Name:" + b.getLessonName()
                                   + "\nDate:" + b.getLessonDate() + "\nBooking Status:" + b.getBookingStatus());
                           System.out.println("Are you sure you want to cancel the booking (y/n):");
                           String confirmation = scanner.next();
                           if (confirmation.equals("y")) {
                               for (Exercise e : exercises){
                                   if(e.getLessonName().equals(b.getLessonName()) && e.getDate().equals(b.getLessonDate())){
                                       int cap = e.getCapacity();
                                       cap++;
                                       e.setCapacity(cap);
                                   }
                               }
                               System.out.println("Booking Cancelled :" + b);
                               System.out.println("Available Classes are:\n");
                               for (Exercise e : exercises){
                                   e.classDetails();
                               }
                           }
                       }
                   }
                   bookings.remove(bookObj);

               }

           }
           else if (userOption == 3)
           {
               System.out.println("Please Enter your Booking ID: ");
               String userBookingId = scanner.next();
               for(Booking b:bookings){
                   if(b.getBookingId().equals(userBookingId)){
                       System.out.println("Booking Details Found\n");
                       System.out.println("Booking ID:" + b.getBookingId() + "\nLesson Name:" + b.getLessonName()
                               + "\nDate:" + b.getLessonDate() + "\nBooking Status:" + b.getBookingStatus());
                       System.out.println("Are you sure you want to attend the Class (y/n):");
                       String confirmation = scanner.next();
                       if (confirmation.equals("y")) {
                           b.attendLesson(userBookingId);
                           System.out.println("Class Attended\n");
                           System.out.println("Please write a review for the class\n");
                           String userReview = scanner.nextLine();
                           b.setReview(userReview);
                           System.out.println("Please give a rating for the Class [1-5] \n");
                           int userRating= scanner.nextInt();
                           b.setRating(userRating);
                       }

                   }

               }
           }
           else if(userOption == 4){
               for(Booking b:bookings){
                   b.bookingDetails();
               }
                System.out.println("Enter the month for report [MM]");
                String userDate = scanner.next();
               for(Booking b:bookings){
                  if((b.getLessonDate().substring(3,5)).equals(userDate)){
                      int rating = 0;
                      long noOfBookings =0;
                      int income = 0;

                      for(Report re:reports){
                          if(re.getLessonName().equals(b.getLessonName())){
                              noOfBookings = bookings.stream().filter(booking -> booking.getLessonName().equals(re.getLessonName())).count();
                              //System.out.println(re.getLessonName() + noOfBookings);
                              re.setNoOfBookings(noOfBookings);
                          }
                      }
                  }
                  else {
                	  System.out.println("Not woring");
                  }
               }


           }
           else if (userOption == 5)
           {
               System.exit(0);
           }
           else {
               System.out.println("Please enter a valid option");
           }
       }
    }
}
