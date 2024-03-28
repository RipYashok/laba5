package commands;

import managers.CommandManager;
import managers.CreateCommands;
import model.Route;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Execute_script extends Command {

    public Execute_script() {
        setTitle("execute_script");
        setDescription("{file_name} - считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
    }

    @Override
    public Command execute(ArrayList<Route> collection, Scanner scanner, String fileCollection, String value) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(value)));
            String string;
            List<String> input;
            while ((string = reader.readLine()) != null) {
                input = new ArrayList<>(Arrays.asList(string.split(" ")));
                if (input.size() == 1) {
                    input.add("null");
                }
                ((Command) CreateCommands.commands().get(input.get(0))).execute(collection, scanner, fileCollection, input.get(1));
                if (input.get(0).equals("exit")){
                    System.out.println("Завершение работы.");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return null;
        } catch (NullPointerException e){
            System.out.println("Данной команды не существует. Введите help, чтобы увидеть перечень существующих команд.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
