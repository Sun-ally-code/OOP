package Classwork;

public class Institution {
    private String name;
    private String city;
    private int launch_yr;

    public Institution(String name, String city, int launch_yr){
        this.name = name;
        this.city = city;
        this.launch_yr = launch_yr;
    }

    public void showDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("City: " + this.city);
        System.out.println("Launch YR: " + this.launch_yr);
    }
}
