import commands.Add;
import model.Route;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Route> collection = new ArrayList<>();
        Add add = new Add();
        InputStreamReader line = new InputStreamReader(System.in);
        if (line.ready() == false){
            line = new InputStreamReader(System.in);
        }
        BufferedReader reader = new BufferedReader(line);
        add.execute(collection, reader);
        add.execute(collection, reader);
        add.execute(collection, reader);
        System.out.println(collection);
    }
}
