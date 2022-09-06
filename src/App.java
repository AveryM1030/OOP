public class App {
    public static void main(String[] args) throws Exception {
        // Abstraction is to work with something we know how to use without
        // knowing how it works internally.
        Student student = new Student("Avery", "Miles", "CHC");
        System.out.println(student.greeting());

        // Write the lines of ode to create an UndergradStudent object.
        // using the student object as the basis for creation.
        // Call the greeting, creditsRemaning, and isMajorComplete methods
        // on the UndergradStuden ojbect.
        UndergradStudent undergrad = new UndergradStudent(student.getFirstName(), student.getLastName(), student.getSchoolName(), 
        3.75, 40, "Computer Science");
        System.out.println(undergrad.greeting());
        System.out.println(undergrad.creditsRemaining(40));
        System.out.println(undergrad.isMajorComplete(40));

        Integer one = 1;
        Double two = 2.0;
        String twoString = "2.0";
        Boolean bool = false;

        // Strongly typed programming languages will attempt to determine the type for you
        System.out.println(one + two);
        System.out.println(one + twoString);

        // System.out.println(one + bool);
    }
}
