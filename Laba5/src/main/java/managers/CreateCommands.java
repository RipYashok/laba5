package managers;

import commands.*;


import java.util.HashMap;
import java.util.Map;

/**
 * Класс с функцией создания коллекции команд
 */
public class CreateCommands {
    /**
     * Функция создания коллекции команд {@link CreateCommands#commands}
     * @return возвращает коллекцию команд
     */
    public static Map commands(){
        Add add = new Add();
        Save save = new Save();
        Exit exit = new Exit();
        Show show = new Show();
        Clear clear = new Clear();
        Remove_by_id removeById = new Remove_by_id();
        Info info = new Info();
        Update updateId = new Update();
        Remove_last removeLast = new Remove_last();
        Add_if_min_dist addIfMinDist = new Add_if_min_dist();
        Average_of_distance averageOfDistance = new Average_of_distance();
        Min_by_coordinates minByCoordinates = new Min_by_coordinates();
        Shuffle shuffle = new Shuffle();
        Count_less_then_distance countLessThenDistance = new Count_less_then_distance();
        Execute_script executeScript = new Execute_script();
        Help help = new Help();
        Map<String, Command> commandsList = new HashMap<>();
        commandsList.put(add.getTitle(), add);
        commandsList.put(save.getTitle(), save);
        commandsList.put(exit.getTitle(), exit);
        commandsList.put(show.getTitle(), show);
        commandsList.put(clear.getTitle(), clear);
        commandsList.put(removeById.getTitle(), removeById);
        commandsList.put(info.getTitle(), info);
        commandsList.put(updateId.getTitle(), updateId);
        commandsList.put(removeLast.getTitle(), removeLast);
        commandsList.put(addIfMinDist.getTitle(), addIfMinDist);
        commandsList.put(averageOfDistance.getTitle(), averageOfDistance);
        commandsList.put(minByCoordinates.getTitle(), minByCoordinates);
        commandsList.put(shuffle.getTitle(), shuffle);
        commandsList.put(countLessThenDistance.getTitle(), countLessThenDistance);
        commandsList.put(executeScript.getTitle(), executeScript);
        commandsList.put(help.getTitle(), help);
        return commandsList;
    }

}
