package DefaultPackage;

public class Report {
	private String lessonName;
    private int rating;
    private long noOfBookings;
    private int income;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getNoOfBookings() {
        return noOfBookings;
    }

    public void setNoOfBookings(long noOfBookings) {
        this.noOfBookings = noOfBookings;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    Report(String lessonName, int rating, int noOfBookings, int income){
        this.lessonName = lessonName;
        this.rating = rating;
        this.noOfBookings = noOfBookings;
        this.income = income;
    }

    public void reportDetails(){
        
    }
}
