import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Writer {

    public static void writeTop(int player){
        Integer[] points = new Integer[20];
        Scanner reader = null;
        int lineReaded = 0;
        Formatter f = null;
        FileWriter fw = null;
        int last =0;
        try {
            reader = new Scanner(Paths.get("score.txt"));
            int z =0;
            while(reader.hasNextLine()) {
                String[] info = reader.nextLine().split(",");
                if(lineReaded <= 20) {
                    if (info[0] != null ) {
                        points[z] = Integer.parseInt(info[0]);
                        z++;
                    }
                }
            }

        } catch (Exception e) {
        } finally {
            if(reader != null) {
                reader.close();
            }
        }
        for(int x =0; x<points.length;x++) {
            if(x == 0 && points[x] == null){
                last = 0;
            }
             else if (points[x] == null){
                last = x;
                last++;
                break;
            }
        }
        points[last] = player;
        sSort(points);


            try {
                PrintWriter writer = new PrintWriter("score.txt");
                writer.print("");
                writer.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            try {
                fw = new FileWriter("score.txt", true);
                f = new Formatter(fw);
                for (int x = 0; x < 11; x++) {
                    if(points[x] != null){
                        f.format("%d\n", points[x]);
                    }
                }
                f.close();
            } catch (Exception e) {

            } finally {
                if (f != null) {
                    f.close();
                }
            }


            try {
                String[] fields = {"Score "};
                reader = new Scanner(Paths.get("score.txt"));
                while (reader.hasNextLine()) {
                    String[] info = reader.nextLine().split(",");
                    for (int i = 0; i < info.length; i++) {
                        System.out.println(fields[i] + info[i].trim());
                    }
                    System.out.println("-------------");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        }


    public static void sSort(Integer[] players) {
        int length = players.length;
        for (int i = 0; i < length - 1; i++) {
            if(players[i] != null){
                int min = i;
                for (int j = i + 1; j < length; j++) {
                    if(players[j] != null)
                    if (players[j] > players[min]) {
                        min = j;
                    }
                }

                int temp = players[min];
                players[min] = players[i];
                players[i] = temp;
            }

        }
    }
}
