package Classwork;

public class University extends Institution{
    private int course_count;
    public University( String name,String city, int launch_yr, int course_count){
        //this constructor initializes the parent class attributes and its own attributes.
        super(name,city,launch_yr);
        this.course_count = course_count;
    }
    @Override
    public void showDetails() {
        //modifies inherited method to also print number of courses.
        super.showDetails();
        System.out.println("No. of courses offered: " + this.course_count);
    }
}
