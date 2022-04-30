public class ChainCalculations {

    public static void main(String[] args) {
        calcHittingTime();
    }

    public static void calcHittingTime(){

        double runningProb = 1.0;
        double runningHittingTime = 0.0;

        for( int i = 0; i < 99; i++){
            double prob = Math.max(0.02, (i-48)*0.02);
            runningHittingTime += (i + 1) * runningProb * prob;
            runningProb *= (1 - prob);
        }

        System.out.println(runningHittingTime);
    }
}
