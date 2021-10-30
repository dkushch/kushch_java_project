import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Activity activity;

    public boolean run(){
        Scanner scanner = new Scanner(System.in);
        this.activity = new Activity(getDefaultBirds());
        String type = new String();
        int command = -1;
        while (command!=0){
            printMenu();
            command =  scanner.nextInt();
        switch (command){
            case 1:
                printTypes();
                type = scanner.next();
                activity.doCrying(type);
                break;
            case 2:
                printTypes();
                type = scanner.next();
                activity.doEating(type);
                break;
            case 3:
                printTypes();
                type = scanner.next();
                activity.doFlying(type);
                break;
            case 4:
                printTypes();
                type = scanner.next();
                activity.doRunning(type);
                break;
            case 5:
                printTypes();
                type = scanner.next();
                activity.doSwimming(type);
                break;
            case 0:
                System.out.println("stopping program..");
                return true;
            default:
                System.out.println("enter value from list");
                break;
        }
        }

        return true;
    }
    public List<Birds> getDefaultBirds(){
        List<Birds> birds = new ArrayList<>();
        birds.add(new Bat());
        birds.add(new Duck());
        birds.add(new Eagle());
        birds.add(new Kiwi());
        birds.add(new Ostrich());
        birds.add(new Penguin());
        birds.add(new Swallow());
        return birds;
    }
    public void printMenu(){
        System.out.println("Menu");
        System.out.println("0: Exit ");
        System.out.println("1: Look how birds cry");
        System.out.println("2: Look how birds eat");
        System.out.println("3: Look how birds fly");
        System.out.println("4: Look how birds run");
        System.out.println("5: Look how birds swim");
    }
    public void printTypes(){
        System.out.println("Choose type of bird or enter 0 two times to exit from program");
        System.out.println("Bat, Duck, Eagle, Kiwi, Ostrich, Penguin, Swallow");
    }

}
