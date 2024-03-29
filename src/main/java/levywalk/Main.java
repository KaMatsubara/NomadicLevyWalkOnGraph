package levywalk;

import java.io.*;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String[] arguments = fileRead(args[0]); // 入力ファイルを解析
        if (arguments == null) {
            System.out.println("Failed to parse the file.");
            return;
        }

        OptionCli options = new OptionCli(); // オプションを定義
        Data d = new Data();
        options.parse(arguments); // 引数を解析
        options.setArguments(d); // 引数をセット

        
        while(d.targetThreshold > d.threshold){　//卒論前で余裕がなかった. 後できれいにしたい
            while(d.step <= 1600){
                options.setFilename(d);
                 for (Integer i = 0; i < d.trial; i++) {
                    d.graphSeed = new Random().nextLong();
                    d.current_trial = i;
                    RandomWalkOnGraph rwGraph = new RandomWalkOnGraph(d);
                    rwGraph.run();
                }
                d.step = d.step * 2;
                
            }
            d.step = 100;
            d.threshold += d.intarvalsOfThreshold;
        }
    
        System.out.println("\noutput the result to \"" + d.file.getName() + "\"");
        return;
    }

    /* データファイルを解析 */
    private static String[] fileRead(String fileName) {
        File file = new File(fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = "";
            String line;
            while ((line = br.readLine()) != null)
                str += line + " ";
            br.close();

            String[] strs = str.split(" ");
            for (int i = 0; i < strs.length; i += 2)
                strs[i] = "-" + strs[i];
            return strs;
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
}
