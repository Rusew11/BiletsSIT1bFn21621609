import java.io.*;

public class FileOpener {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name.");
            return;
        }
        String fileName = args[0];
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            System.out.println("Successfully opened " + fileName);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unsuccessfully opened " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error while reading file " + fileName);
            e.printStackTrace();
        }
    }
}