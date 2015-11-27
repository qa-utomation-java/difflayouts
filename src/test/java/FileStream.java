import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStream {

    private ArrayList<String> list = new ArrayList<>();

    public FileStream(String directory, String fileName) {
        readFile(directory, fileName);
    }

    public ArrayList<String> getUrls() {
     return list;
    }

    private void readFile(String directory, String fileName) {
        File file = new File(directory, fileName);
        Scanner read = null;
        try  {
            read = new Scanner(file.getAbsoluteFile());
            while (read.hasNext()) {
                list.add(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error readFile" + e.getMessage());
        } finally {
            if(read != null) {
                read.close();
            }
            //int listCount = list.size();
        }
    }
}
