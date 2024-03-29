package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс команды удаления последнего элемента коллекции
 */
public class Remove_last extends Command{
    public Remove_last(){
        setTitle("remove_last");
        setDescription(" - удалить последний элемент из коллекции");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        collection.remove(collection.size()-1);
        System.out.println("Удален последний элемент коллекции.");
        return null;
    }
}
