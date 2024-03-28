package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Remove_by_id extends Command{

    public Remove_by_id(){
        setTitle("remove_by_id");
        setDescription(" {id} - удалить элемент из коллекции по его id");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Route route = null;
        try {
            for (Route object : collection){
                if (object.getId().equals(Integer.parseInt(value))){
                    route = object;
                    break;
                }
            }
            if (route != null){
                collection.remove(route);
                System.out.println("Маршрут с Id = " + value + " удален");
            }
            else {
                System.out.println("Маршрута с Id = " + value + " нет в коллекции");
            }
        }catch (NumberFormatException e){
            System.out.println("Id является числом!'");
        }
        return null;
    }
}
