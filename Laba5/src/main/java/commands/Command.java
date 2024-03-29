package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Родительский класс всех команд
 */
public abstract class Command {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public abstract Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException;

}
