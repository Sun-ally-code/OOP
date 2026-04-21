package Classwork;

public class HighSchool extends Institution{
    private String curriculum;
    public HighSchool(String name, String city, int launch_yr, String curriculum) {
        super(name, city, launch_yr);
        this.curriculum = curriculum;


    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Curriculum: " + this.curriculum);
    }
}
