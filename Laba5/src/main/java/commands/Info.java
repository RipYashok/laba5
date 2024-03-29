package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Класс команды вывода информации о коллекции
 */
public class Info extends Command{

    public Info(){
        setTitle("info");
        setDescription(" - вывести в стандартный поток вывода информацию о коллекции");
    }

    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        Date initTime = new Date();
        System.out.println("Тип коллекции: ArrayList" + "\n" +
                "Дата инициализации: " + initTime + "\n" +
                "Количество элементов: " + collection.size());
        return null;
    }
}
