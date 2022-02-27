import java.util.Random;

public class Idenifier {

    private Random rand;

    public Idenifier(){
        rand=new Random();
    }

    public int id(){
        int ran = rand.nextInt(100);
        if(ran<=35){
            return 1;
        }
        else if(ran<=70){
            return 2;
        }
        else{
            return -1;
        }
    }
}
