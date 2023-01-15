public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Sebastian Szewczyk";
        student1.number = 26749;

        Student student2 = new Student();

        System.out.println("Student's name: " + student1.name);
        System.out.println("Student's number: " + student1.number);
        System.out.println("------------------------");
        System.out.println("Student's name: " + student2.name);
        System.out.println("Student's number: " + student2.number);


        SecretStudent secretStudent = new SecretStudent();
        secretStudent.setName("Sebastian Szewczyk");
        // secretStudent.setName();  - brak możliwości ustawienia nulla


        System.out.println("------------------------------");

        SecretStudent secretStudent1 = new SecretStudent();
        String result = secretStudent1.readFromScanner();
        secretStudent1.print(result);

    }

}
