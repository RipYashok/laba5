package commands.utils;

import java.util.ArrayList;

public class GeneratorID {

    public Integer GenerateID(ArrayList collection){
        Integer ID = 1;
        while (collection.contains(collection.get(ID)))
            ID ++;
        return ID;
    }
}
