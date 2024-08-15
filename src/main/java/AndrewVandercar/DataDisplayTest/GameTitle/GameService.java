package AndrewVandercar.DataDisplayTest.GameTitle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;

        //this.gameRepository.save(new Game(3, "Gex", 1998, "Playstation"));
    }

    public List<Game> GetGameList(){
        //return List.of(new Game(3, "Gex", 1998, "Playstation"));
        return gameRepository.findAll();
    }

    public void SaveGame(Game newGame){
        // if the game is already on the list, don't add it
        if(gameRepository.GetGameByName(newGame.getGame_Name()).isPresent()) return;
        gameRepository.save(newGame);
    }

    public void RemoveGame(int id){
        // check if there's something there to remove
        if(gameRepository.existsById(id))
            gameRepository.deleteById(id);
    }
}
