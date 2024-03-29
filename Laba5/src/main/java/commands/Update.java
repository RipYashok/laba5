package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс команды обновления элемента по id коллекции
 */
public class Update extends Command{

    public Update(){
        setTitle("update");
        setDescription("{id} - обновить значение элемента коллекции, id которого равен заданному");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Add add = new Add();
        Route route = null;
        try {
            for (Route object : collection){
                if (object.getId().equals(Integer.parseInt(value))){
                    route = object;
                    break;
                }
            }
            if (route != null){
                collection.remove(route);;
            }
            add.execute(collection, scanner, fileCollection, value);
        return null;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}

