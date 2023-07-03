package mainwindow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Connection {
    static String filename="Customerdata.txt";
    static void writetoFile(String data) throws IOException {
        FileWriter write = new FileWriter(filename, true);
        BufferedWriter writer = new BufferedWriter(write);
        writer.write(data);
        writer.newLine();
        writer.close();
    }

}
