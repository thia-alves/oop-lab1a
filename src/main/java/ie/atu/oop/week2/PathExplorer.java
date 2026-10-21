package ie.atu.oop.week2;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathExplorer
{
    public static void main(String[] args)
    {
        Path file = Path.of("data","books.cvs");

        System.out.println("Path" + file);
        System.out.println("file name: " + file.getFileName());
        System.out.println("Path: " + file.toAbsolutePath());
        System.out.println("Parent Path: " + file.getParent());
        System.out.println("Exists " + Files.exists(file));
    }
}
//Beep
//Boop