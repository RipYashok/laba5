package managers;

import model.Coordinates;
import model.Location;
import model.Route;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FileScan {

    public static ArrayList<Route> scan(String file){
        ArrayList<Route> collection = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            while ((line = reader.readLine()) != null){
                Route route = new Route();
                Coordinates coordinates = new Coordinates();
                Location locationFrom = new Location();
                Location locationTo = new Location();
                String[] fields = line.split(",");
                route.setId(Integer.valueOf(fields[0]));
                route.setName(fields[1]);
                coordinates.setX(Float.parseFloat(fields[2]));
                coordinates.setY(Long.parseLong(fields[3]));
                route.setCoordinates(coordinates);
                route.setCreationDate(LocalDate.parse(fields[4]));
                locationFrom.setName(fields[5]);
                locationFrom.setX(Long.valueOf(fields[6]));
                locationFrom.setY(Double.valueOf(fields[7]));
                locationFrom.setZ(Integer.valueOf(fields[8]));
                route.setFrom(locationFrom);
                locationTo.setName(fields[9]);
                locationTo.setX(Long.valueOf(fields[10]));
                locationTo.setY(Double.valueOf(fields[11]));
                locationTo.setZ(Integer.valueOf(fields[12]));
                route.setTo(locationTo);
                route.setDistance(13);
                collection.add(route);
            }
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("Файл не найден. Данные не считаны.");
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return collection;
    }
}

