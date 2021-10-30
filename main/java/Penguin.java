public class Penguin implements Birds {
    private String food = "fish,krill,squids";
    private String type = "Penguin";

    public String getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("penguin is swimming trying to find some food");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating"
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("Penguin is rolling on the belly");
    }

    @Override
    public void cry() {
        System.out.println("peep peep");
    }

    @Override
    public void fly() {
        System.out.println("Penguin is a flightless bird but they swimming skills are really cool");
    }
}
