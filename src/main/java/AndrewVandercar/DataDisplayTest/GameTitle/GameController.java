package AndrewVandercar.DataDisplayTest.GameTitle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/GameList")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping
    public List<Game> GameList(){
        return gameService.GetGameList();
    }

    public void AddNewGame(Game newGame){
        gameService.SaveGame(newGame);
    }

    public void RemoveGame(int id){
        gameService.RemoveGame(id);
    }
}
