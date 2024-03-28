import managers.CommandManager;
import managers.FileScan;
import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileCollection = System.getenv("Collection");
        ArrayList<Route> collection = FileScan.scan(fileCollection);
        System.out.println("Введите команду.");
        Scanner scanner = new Scanner(System.in);
        CommandManager.run(collection, scanner, fileCollection);
    }
}
