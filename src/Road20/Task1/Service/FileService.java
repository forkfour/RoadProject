package Road20.Task1.Service;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileService {
    public static File[] files;
    public static File[] generateFiles(){
        File f1 = new File("Readme", 4, FileType.TEXT);
        File f2 = new File("Ironman", 4_000_000, FileType.VIDEO);
        File f3 = new File("Metallica", 400, FileType.AUDIO);
        File f4 = new File("He-Man", 400_000, FileType.VIDEO);
        File f5 = new File("Tales", 40, FileType.AUDIO);
        return new File[]{f1, f2, f3, f4, f5};
    }
    public static File getFileToSearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input filename: ");
        String input = scanner.nextLine();
        return new File(input, 0, FileType.VIDEO);
    }

    public static void fileSearch(File file) throws FileNotFoundException {
        for (File f : files){
            if (f.equals(file)){
                System.out.println("Found the File!");
                System.out.println(f);
            }
        } throw new FileNotFoundException("File is not found. Exception throwed!");
    }
}
