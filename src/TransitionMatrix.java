import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TransitionMatrix {

    public static void main(String[] args) throws IOException {
        output();
    }

    public static void output() throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter("Arknights State Space.csv"));
        for (int i = 0; i < 99; i++) {
            double prob = Math.max(0.02, (i-48)*0.02);
            prob = (double) Math.round(prob * 100d) / 100d;
            fw.append(prob+",");
            for (int j = 0; j < 98; j++) {
                if (i == j) {
                    double newProb = (double) Math.round((1-prob) * 100d) / 100d;
                    fw.append(newProb+",");
                }
                else {
                    fw.append(0+",");
                }
            }
            fw.append(0+"\n");
        }
        fw.flush();
        fw.close();
    }
}
