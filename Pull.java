import java.util.Random;

public class Pull {

    private final Random rand = new Random();

    public Pull(){}

    public boolean pull(int pullsSince6){
        int pull = rand.nextInt(100);
        if(pullsSince6 < 50) {
            return pull <= 2;
        }
        else{
            return pull <= 2 + (pullsSince6-49) * 2;
        }
    }
}
