public class Bat implements Birds {
    private String food = "insects,fruits,nectar,pollen";
    private String type = "Bat";

    public String getType() {
        return type;
    }

    @Override
    public void swim() {

    }

    @Override
    public void eat() {
        System.out.println("Bat is eating"
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("Bat can't run, check how it flies");
    }

    @Override
    public void cry() {
        System.out.println("pipipip");
    }

    @Override
    public void fly() {
        System.out.println("This bat flies great");
    }
}
