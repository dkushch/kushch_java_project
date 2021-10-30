import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            System.out.println("1 to start program about birds, 2 to start employee app");
            int choice = scanner.nextInt();
        if (choice == 1) {
            Controller controller1 = new Controller();
            controller1.run();
        }else if (choice == 2){
            EmployeeAppController controller2 = new EmployeeAppController();
            controller2.run();
        }else if (choice == 0){
            System.out.println("Stopping application process");
            exit=true;
        }
        }
    }
}
