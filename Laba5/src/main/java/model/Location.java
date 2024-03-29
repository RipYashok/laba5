package model;

/**
 * Класс локации с полями <b>x</b>, <b>y</b>, <b>z</b> и <b>name</b>
 */
public class Location {
    /**
     * Поле координаты x
     */
    private Long x; //Поле не может быть null
    /**
     * Поле координаты y
     */
    private Double y; //Поле не может быть null
    /**
     * Поле координаты z
     */
    private Integer z; //Поле не может быть null
    /**
     * Поля названия локации
     */
    private String name; //Строка не может быть пустой, Поле не может быть null

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "," + x + "," + y + "," + z;
    }
}
