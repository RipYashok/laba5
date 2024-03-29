package model;

/**
 * Класс координат маршрута с полями <b>x</b> и <b>y</b>
 */
public class Coordinates {
    /**
     * Поле координаты x
     */
    private float x; //Значение поля должно быть больше -580
    /**
     * Поле координаты y
     */
    private long y; //Значение поля должно быть больше -339

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
