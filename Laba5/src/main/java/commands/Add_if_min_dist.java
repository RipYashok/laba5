package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Add_if_min_dist extends Command{
    public Add_if_min_dist(){
        setTitle("add_if_min_dist");
        setDescription(" {distance} - добавить новый элемент в коллекцию, если значение его дистанции меньше, чем наименьшее значение у элемента этой коллекции");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Add add = new Add();
        Long minDist = Long.MAX_VALUE;
        try{
            if (Long.parseLong(value) <= 1){
                System.out.println("Дистанция должна быть больше 1.");
            }
            else {
                for (Route route : collection) {
                    if (route.getDistance() < minDist) {
                        minDist = route.getDistance();
                    }
                }
                if (Long.parseLong(value) < minDist) {
                    add.execute(collection, scanner, fileCollection, value);
                } else {
                    System.out.println("Данное значение дистанции не является наименьшим");
                }
            }
        } catch (NumberFormatException e){
            System.out.println("Дистанция это целое число!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
