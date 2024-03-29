package commands;

import managers.CreateCommands;
import model.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Help extends Command{

    public Help(){
        setTitle("help");
        setDescription(" - вывести справку по доступным командам");
    }
    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {

        Map<String, Command> commandList = CreateCommands.commands();

        for (String name  : commandList.keySet()){
            System.out.println(commandList.get(name).getTitle() + commandList.get(name).getDescription());
        }
        return null;
    }
}
