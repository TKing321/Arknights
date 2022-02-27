public class Pulls {

    private int pullsSince6;
    private Pull puller;
    private int successes;

    public Pulls(){
        pullsSince6=0;
        puller = new Pull();
    }
    public int doPulls(int numberOfPulls){
        for(int i = 0;i<numberOfPulls;i++){
            if(puller.pull(pullsSince6)){
                pullsSince6=0;
                successes+=1;
            }
            else{
                pullsSince6+=1;
            }
        }
        return successes;
    }
}
