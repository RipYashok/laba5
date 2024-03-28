package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Shuffle extends Command {

    public Shuffle(){
        setTitle("shuffle");
        setDescription(" - перемешать элементы коллекции в случайном порядке");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Collections.shuffle(collection);
        System.out.println("Коллекция перемешана.");
        return null;
    }
}
