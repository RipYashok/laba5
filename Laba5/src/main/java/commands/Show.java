package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Show extends Command {
    public Show(){
        setTitle("show");
        setDescription(" -  вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        for (Route element : collection){
            System.out.println("Id: " + element.getId() + "\n" +
                    "Название маршрута: " + element.getName() + "\n" +
                    "Координаты: x = " + element.getCoordinates().getX() + "; y = " + element.getCoordinates().getY() + "\n" +
                    "Дата создания: " + element.getCreationDate() + "\n" +
                    "Место отправки:" + "\n" +
                    "Название: " + element.getFrom().getName() + "\n" +
                    "Координаты: x = " + element.getFrom().getX() + "; y = " + element.getFrom().getY() + "; z = " + element.getFrom().getZ() + "\n" +
                    "Место назначения:" + "\n" +
                    "Название: " + element.getTo().getName() + "\n" +
                    "Координаты: x = " + element.getTo().getX() + "; y = " + element.getTo().getY() + "; z = " + element.getTo().getZ() + "\n" +
                    "Расстояние: " + element.getDistance() + "\n");
        }
        if (collection.isEmpty()){
            System.out.println("Коллекция пуста.");
        }
        return null;
    }
}
