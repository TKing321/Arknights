
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LineGraph {

    private LineGraph() {

    }

    static Pulls pulls;
    static int[] x;
    static double[] y;
    static int numOfTrials;

    public static void main(String[] args) throws IOException {
        test(10000,1000);
        output();
    }

    public static void test(int numOfTrials, int range){
        LineGraph.numOfTrials = numOfTrials;
        x = new int[range];
        y = new double[range];
        for(int i = 0;i<range;i++){
            x[i] = i+1;
            y[i] = individualTest(numOfTrials,i+1);
            System.out.println(i);
        }
    }

    public static double individualTest(int numOfTrials, int numberOfPulls){
        double total = 0;
        for(int i = 0;i<numOfTrials;i++){
            pulls=new Pulls();
            total+=pulls.doPulls(numberOfPulls);
        }
        return total/ (double) numOfTrials;
    }

    public static void output() throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter("Output_"+numOfTrials+".csv"));
        for(int i=0;i<x.length;i++){
            fw.append(String.valueOf(x[i])).append(",");
            fw.append(String.valueOf(y[i]));
            fw.append("\n");
        }
        fw.flush();
        fw.close();
    }

}