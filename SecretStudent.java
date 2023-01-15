import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SecretStudent {

    private String name = "default";
    private String surname = "default";
    private int number = 0;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        if (name == null) {
            return;
        }
        this.name = name;
    }

    public String readFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        this.name = name;
        System.out.println("Enter your surname: ");
        String surname = scanner.next();
        this.surname = surname;
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        this.number = number;
        String result = "name: " + name + "\nsurname: " + surname + "\nnumber: " + number;
        return result;
    }

    public void print(String result) {
        System.out.println(result);
    }
}
