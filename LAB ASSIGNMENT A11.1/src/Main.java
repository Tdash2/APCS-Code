public class Main {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "Male");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "Female", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher drJava = new Teacher("Doc Java", 34, "Nonbinary", "Computer Science", 50000);
        System.out.println(drJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "Female", "UCB123",
                4.0, 1, "English");
        System.out.println(ima);
    }
}