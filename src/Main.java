import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // Get the directory path from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the directory path of the MP4 files you want to delete?");
        String directoryPath = scanner.nextLine();

        // Get the list of MP4 files in the directory
        File directory = new File(directoryPath);
        File[] mp4Files = directory.listFiles((dir, name) -> name.endsWith(".mp4"));

        // Iterate over the MP4 files and delete them
        for (File mp4File : mp4Files) {
            mp4File.delete();
        }

        System.out.println("The MP4 files have been deleted successfully.");
    }
}