public class Duck implements Birds {
    public String food = "sweetcorn,lettuce,peas,oats,seeds,rice";
    public String area = "wetlands,marshes,ponds,rivers,lakes and oceans";
    private String type = "Duck";

    public String getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("duck swim in wetlands, marshes, ponds, rivers, lakes and oceans");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating "
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void cry() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
