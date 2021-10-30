public class Eagle implements Birds {
    private String food = "fish,small birds,reptiles,rabbits,ground squirrels,bighorn sheep";
    private String type = "Eagle";

    public String getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("eagles can't swim");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating"
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("Eagles can't run but they fly really well and fast");
    }

    @Override
    public void cry() {
        System.out.println(" kwit-kwit-kwit-kwit-kee-kee-kee-kee-ker");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
