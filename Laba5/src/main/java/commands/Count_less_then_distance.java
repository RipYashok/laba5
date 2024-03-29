package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс команды, выводящей количество элементов коллекции, дистанция которых меньше заданной
 */
public class Count_less_then_distance extends Command{

    public Count_less_then_distance(){
        setTitle("count_less_then_distance");
        setDescription("{distance} - вывести количество элементов, значение поля distance которых меньше заданного");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Integer count = 0;
        for (Route route : collection){
            if (Long.parseLong(value) > route.getDistance()){
                count++;
            }
        }
        System.out.println("Количество элементов, у которых значение поля distance меньше " + value + ": " + count);
        return null;
    }
}
