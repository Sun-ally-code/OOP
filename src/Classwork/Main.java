package Classwork;

public class Main {
    public static void main(String[] args) {
        Institution obj1 = new Institution ("Madaraka Pri. School", "Nairobi", 1999);
        HighSchool obj2 = new HighSchool ("Kianda Sch. ", "Nrb", 2010,"844");
        University obj3 = new University ("Strathmore Univ.", "Nairobi", 1978, 17);

        obj1.showDetails();
        System.out.println("\n");

        obj2.showDetails();
        System.out.println("\n");

        obj3.showDetails();
        System.out.println("\n");
    }
}
