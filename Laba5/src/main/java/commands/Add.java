package commands;

import model.Coordinates;
import model.Location;
import model.Route;
import org.apache.commons.lang3.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Add extends Command{

    public Add(){
        setTitle("Add");
        setDescription(" -  добавить новый элемент в коллекцию");
    }

    public Integer newID(ArrayList collection, Route route){
        int ID = 0;
        try {
            while (collection.contains(collection.get(ID)))
                ID ++;
        } catch (IndexOutOfBoundsException e){
            route.setId(ID+1);
        }
        return ID;
    }

    public void chooseName(Route route, BufferedReader reader) throws IOException {

        System.out.println("Введите название маршрута:");
        String name = String.valueOf(reader.readLine());
        while (StringUtils.isBlank(name)){
            System.out.println("Некорректное название маршрута. Введите название повторно:");
            name = String.valueOf(reader.readLine());
        }
        route.setName(name);
    }

    public void chooseCoordinates(Route route, BufferedReader reader){
        Coordinates coordinates = new Coordinates();
        while (true) {
            try {
                System.out.println("Введите координату X для маршрута, она должна быть больше -580:");
                String x = reader.readLine();
                while (StringUtils.isBlank(x) || Float.parseFloat(x) <= -580) {
                    System.out.println("Некорректна введена координата. Введите повторно:");
                    x = reader.readLine();
                }
                coordinates.setX(Float.parseFloat(x));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Координата X является числом!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        while (true){
            try {
                System.out.println("Введите координату Y для маршрута, она должна быть больше -339:");
                String y = reader.readLine();
                while (StringUtils.isBlank(y) || Long.parseLong(y) <= -339) {
                    System.out.println("Некорректна введена координата. Введите повторно:");
                    y = reader.readLine();
                }
                coordinates.setY(Long.parseLong(y));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Координата Y является целым числом!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        route.setCoordinates(coordinates);
    }

    public void newTime(Route route){
        route.setCreationDate(LocalDate.now());
    }

    public void chooseLocation(Route route, BufferedReader reader) throws IOException {
        Location location = new Location();
        String direction = new String();
        for (int i = 0; i <= 1; i++) {
            if (i == 0){
                direction = "отправления";
            } else if (i == 1){
                direction = "назначения";
            }
            System.out.println("Введите название локации " + direction + ":");
            String name = String.valueOf(reader.readLine());
            if (StringUtils.isBlank(name)) {
                name = null;
                location.setName(name);
                continue;
            }
            location.setName(name);
            while (true) {
                try {
                    System.out.println("Введите координату X локации " + direction + ":");
                    String x = reader.readLine();
                    while (StringUtils.isBlank(x)) {
                        System.out.println("Некорректна введена координата. Введите повторно:");
                        x = reader.readLine();
                    }
                    location.setX(Long.parseLong(x));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Координата X является целым числом!");
                }
            }
            while (true) {
                try {
                    System.out.println("Введите координату Y локации " + direction + ":");
                    String y = reader.readLine();
                    while (StringUtils.isBlank(y)) {
                        System.out.println("Некорректна введена координата. Введите повторно:");
                        y = reader.readLine();
                    }
                    location.setY(Double.parseDouble(y));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Координата Y является числом!");
                }
            }
            while (true) {
                try {
                    System.out.println("Введите координату Z локации " + direction + ":");
                    String z = reader.readLine();
                    while (StringUtils.isBlank(z)) {
                        System.out.println("Некорректна введена координата. Введите повторно:");
                        z = reader.readLine();
                    }
                    location.setZ(Integer.parseInt(z));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Координата Z является целым числом!");
                }
            }
            if (i == 0){
                route.setFrom(location);
            } else if (i == 1){
                route.setTo(location);
            }
        }
    }

    public void chooseDistance(Route route, BufferedReader reader){
        while (true){
            try {
                System.out.println("Введите длину маршрута, она должна быть больше 1:");
                String distance = reader.readLine();
                while (StringUtils.isBlank(distance) || Long.parseLong(distance) <= 1) {
                    System.out.println("Некорректна введена дистанция. Введите повторно:");
                    distance = reader.readLine();
                }
                route.setDistance(Long.parseLong(distance));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Дистанция является целым числом!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Route execute(ArrayList collection, BufferedReader reader) throws IOException{
        Route route = new Route();
        Integer ID = newID(collection, route);
        chooseName(route, reader);
        chooseCoordinates(route, reader);
        newTime(route);
        chooseLocation(route, reader);
        chooseDistance(route, reader);
        System.out.println(route);
        collection.add(ID, route);
        return route;
    }
}
