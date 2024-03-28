package managers;

import commands.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class CommandManager {

    public static void run(ArrayList collection, Scanner scanner, String fileCollection) {

        while(true) {
            List<String> input;
            try {
                String string = scanner.nextLine().trim();
                input = new ArrayList<>(Arrays.asList(string.split(" ")));
                if (input.size() == 1) {
                    input.add("null");
                }
                ((Command) CreateCommands.commands().get(input.get(0))).execute(collection, scanner, fileCollection, input.get(1));
                if (input.get(0).equals("exit")){
                    System.out.println("Завершение работы.");
                    break;
                }
            } catch (FileNotFoundException e){
                System.out.println("Файл не найден.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NoSuchElementException e){
                scanner.close();
                System.out.println("Ошибка ввода: " + e.getMessage());
                break;
            } catch (NullPointerException e){
                System.out.println("Данной команды не существует. Введите help, чтобы увидеть перечень существующих команд.");
            }
        }
    }
}
