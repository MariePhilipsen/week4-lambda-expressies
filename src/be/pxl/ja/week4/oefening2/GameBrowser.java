package be.pxl.ja.week4.oefening2;

import java.beans.Visibility;
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

    public ArrayList<VideoGame> showFreeGames(){
        return gameCollection.selectGames(videoGame -> {
            if(videoGame.getPrice() == 0){
                return true;
            }
            return false;
        });

    }

    public ArrayList<VideoGame> showGamesInGenre(String genre){
        return gameCollection.selectGames(new Predicate<VideoGame>() {
            @Override
            public boolean test(VideoGame videoGame) {
                for (String genreName : videoGame.getGenres()) {
                    if (genreName.toLowerCase().equals(genre)) {
                       return true;
                    }
                }
                return false;

            }
        });
    }

}






