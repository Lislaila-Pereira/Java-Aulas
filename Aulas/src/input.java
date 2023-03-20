import java.util.Scanner;

public class input {
    public void method(){
        Scanner scanner = new Scanner(System.in); //creating a varible thats point to a Scanenr objetc
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your age: ");
        int age = scanner.nextInt();
        System.out.println("your name is" + name + " your age is" + age);
    }

}
