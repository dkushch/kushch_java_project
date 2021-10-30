public class Swallow implements Birds{
    private String type = "Swallow";
    private String food = "flies,grasshoppers,crickets,dragonflies,beetles";
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("This kind of birds can't swim");
    }

    @Override
    public void eat() {
        System.out.println("Swallow is eating"
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("This bird can't run, but it could fly");
    }

    @Override
    public void cry() {
        System.out.println("cirrrririri");
    }

    @Override
    public void fly() {
        System.out.println("Swallow fly very fast");
    }
}
