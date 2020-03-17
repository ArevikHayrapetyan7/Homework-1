import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
   // static final int MAX_SIZE_WORDS = 100;

    public static void main(String[] args) throws IOException {
        File file = new File("source.txt");
        file.createNewFile();
        File result = new File("result.txt");
        result.createNewFile();
        countOfHello(file, result);
    }

    static void countOfHello(File file, File result) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(result));
        String line = reader.readLine();
        String[] words ;
        int count = 0;
        int l = 1;
        while (line != null) {
            words = line.split(" ");
            for (String word :words) {
                if(word.equals("Hello")) {
                    count++;
                }
            }
            writer.write("line" + Integer.toString(l)+"-"+Integer.toString(count)+"\n");
            count = 0 ;
            l++;
            line = reader.readLine();
        }
        writer.flush();
    }
}
