package be.pxl.ja.week4.oefening2;

import com.sun.org.apache.xerces.internal.dom.PSVIDOMImplementationImpl;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GameCollection {

    private ArrayList<VideoGame> list = new ArrayList<>();

    public void addGame(VideoGame videoGame){
        list.add(videoGame);
    }

    public ArrayList<VideoGame> selectGames(Predicate<VideoGame> videoGameTest){
        ArrayList<VideoGame> result = new ArrayList<>();

        for (VideoGame aList : list) {
            if (videoGameTest.test(aList)) {
                result.add(aList);
            }

        }
        return result;
    }
}
