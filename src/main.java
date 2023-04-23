public class main {
    public static void main(String[] args) {
        FileOpener opener = new FileOpener();
        String filePath = "C:\\path\\filename_example.txt";
        String[] fileArgs = { filePath };
        opener.main(fileArgs);
    }
}
