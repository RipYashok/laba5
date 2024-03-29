package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс команды вывода любого элемента коллекции, дистанция которого меньше заданного значения
 */
public class Min_by_coordinates extends Command{
    public Min_by_coordinates(){
        setTitle("min_by_coordinates");
        setDescription(" - вывести любой объект из коллекции, значение поля coordinates которого является минимальным");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Double minCoor = Double.MAX_VALUE;
        Route route = collection.get(0);
        Show show = new Show();
        for (Route object : collection){
            Double sumCoor = (double) (object.getCoordinates().getX() + object.getCoordinates().getY());
            if (minCoor >= sumCoor){
                minCoor = sumCoor;
                route = object;
            }
        }
        ArrayList<Route> minRoute = new ArrayList<>();
        minRoute.add(route);
        show.execute(minRoute, scanner, fileCollection, value);
        return null;
    }
}
