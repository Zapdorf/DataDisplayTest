package AndrewVandercar.DataDisplayTest.GameTitle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public List<Game> GetGameList(){
        //return List.of(new Game(3, "Gex", 1998, "Playstation"));
        return gameRepository.findAll();
    }
}
