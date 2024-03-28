package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Clear extends Command{

    public Clear(){
        setTitle("clear");
        setDescription(" - очистить коллекцию");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        collection.clear();
        System.out.println("Коллекция очищена.");
        return null;
    }
}
