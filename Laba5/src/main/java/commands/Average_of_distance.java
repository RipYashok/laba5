package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс команды вывода элемента коллекции с минимальным значением поля coordinates
 */
public class Average_of_distance extends Command{
    public Average_of_distance(){
        setTitle("average_of_distance");
        setDescription(" - вывести любой объект из коллекции, значение поля coordinates которого является минимальным");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Double avg = (double) 0;
        for (Route route : collection){
            avg += route.getDistance();
        }
        avg = avg/collection.size();
        System.out.println("Среднее значение дистанции в коллекции: " + avg);
        return null;
    }
}
