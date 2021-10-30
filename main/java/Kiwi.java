public class Kiwi implements Birds {
    private String food = "woodlice,millipedes,centipedes,slugs,snails,spiders,insects,seeds,berries,plant material";
    private String type = "Kiwi";

    public String getType() {
        return type;
    }

    @Override
    public void swim() {
        System.out.println("Eagle can't swim, so he starts go under");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating"
                +food.split(",")[(int)(Math.random() * food.split(",").length-1)]);
    }

    @Override
    public void run() {
        System.out.println("Eagles can't run, only fly");
    }

    @Override
    public void cry() {
        System.out.println("ki-ki-ki-ki-ki-ki-ker");
    }

    @Override
    public void fly() {
        System.out.println("Fast flying eagle is flying");
    }
}
