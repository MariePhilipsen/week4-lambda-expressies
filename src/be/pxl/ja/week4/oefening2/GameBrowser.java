package be.pxl.ja.week4.oefening2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GameBrowser {

    private GameCollection gameCollection;


    public GameBrowser(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

/*    public ArrayList<VideoGame> showGamesForSearch(String search){
        return gameCollection.selectGames(new Predicate<VideoGame>() {
            @Override
            public boolean test(VideoGame videoGame) {
                if(videoGame.getName().toLowerCase().contains(search.toLowerCase())){
                    return true;
                }
                return false;
            }
        });

    }*/

    public ArrayList<VideoGame> showGamesForSearch(String search){
        return gameCollection.selectGames(videoGame -> {
            if(videoGame.getName().toLowerCase().contains(search.toLowerCase())){
                return true;
            }
            return false;
        });

    }

    // kan nog korter -> if -> lampje, simplify
}






