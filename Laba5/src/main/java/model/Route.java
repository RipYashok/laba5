package model;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Класс маршрута коллекции с полями <b>id</b>, <b>name</b>, <b>coordinates</b>, creation date, <b>location from</b>, <b>location to</b> и <b>distance</b>
 */
public class Route implements Comparable<Route> {
    /**
     * поле Id
     */
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    /**
     * Поле названия маршрута
     */
    private String name; //Поле не может быть null, Строка не может быть пустой
    /**
     * Поле координат маршрута
     */
    private Coordinates coordinates; //Поле не может быть null
    /**
     * Поле даты создания
     */
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    /**
     * Поле локации отправления
     */
    private Location from; //Поле может быть null
    /**
     * Поле локации прибытия
     */
    private Location to; //Поле может быть null
    /**
     * Поле дистанции
     */
    private long distance; //Значение поля должно быть больше 1

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Location getFrom() {
        return from;
    }

    public void setFrom(Location from) {
        this.from = from;
    }

    public Location getTo() {
        return to;
    }

    public void setTo(Location to) {
        this.to = to;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return  id + "," + name + "," + coordinates + "," + creationDate + "," + from + "," + to + "," + distance;
    }

    @Override
    public int compareTo(Route o) {
        return Integer.compare(this.id, o.id);
    }
}
