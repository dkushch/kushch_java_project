public class Ostrich implements Birds {
    private String food = "green grasses," +
            "wild leaves and bushes," + "shrubs," +
            "plant roots,plant seeds,flora,sprouts,berries," +
            "nuts,succulents,mice,rats,snakes,lizards,frogs,grasshoppers,locusts,crickets,Moths";
    private String area = "savannas and woodlands of Africa";
    private String type = "Ostrich";

    public String getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("ostrich swim");
    }

    @Override
    public void eat() {
        System.out.println("Ostrich is eating"
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("Ostrich is running in " + area);
    }

    @Override
    public void cry() {
        System.out.println("Ostrich do a roaring noise which is simmilar to a lion's roar");
    }

    @Override
    public void fly() {
        System.out.println("Octriches can't fly, but they could run very well");
    }
}
