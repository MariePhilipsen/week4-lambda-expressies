package be.pxl.ja.week4.oefening2;

import java.util.ArrayList;

public class GameCollection {

    private ArrayList<VideoGame> list = new ArrayList<>();

    public void addGame(VideoGame videoGame){
        list.add(videoGame);
    }
}
