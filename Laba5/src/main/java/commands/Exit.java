package commands;

import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exit extends Command{

    public Exit(){
        setTitle("exit");
        setDescription(" - завершить программу (без сохранения в файл)");
    }

    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {

        return null;
    }
}
