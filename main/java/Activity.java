import java.util.ArrayList;
import java.util.List;

public class Activity<T extends Birds> {
    private List<T> birds;
    public Activity(List<T> birds){
        this.birds = new ArrayList<>(birds);
    }
    public void doCrying(String type){
        for (Birds bird : birds){
            if (bird.getType().equals(type)) {
                bird.cry();
            }
        }
    }
    public void doSwimming(String type){
        for (Birds bird : birds){
            if (bird.getType().equals(type)) {
                bird.swim();
            }
        }
    }
    public void doEating(String type){
        for (Birds bird : birds){
            if (bird.getType().equals(type)) {
                bird.eat();
            }
        }
    }
    public <T extends Birds> void doRunning(String type){
        for (Birds bird : birds){
            if (bird.getType().equals(type)) {
                bird.run();
            }
        }
    }
    public <T extends Birds> void doFlying(String type){
        for (Birds bird : birds){
            if (bird.getType().equals(type)) {
                bird.fly();
            }
        }
    }
}
