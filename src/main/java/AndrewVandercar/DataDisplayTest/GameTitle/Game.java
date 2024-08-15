package AndrewVandercar.DataDisplayTest.GameTitle;


import jakarta.persistence.*;

@Entity
@Table(name="favorite_games")
public class Game {
    /*
    For object mapping to the database
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int ID;
    public String Game_Name;
    public int Release_Year;
    public String Platform;

    public Game(){

    }

    public Game(int ID, String gameName, int releaseYear, String platform) {
        this.ID = ID;
        Game_Name = gameName;
        Release_Year = releaseYear;
        Platform = platform;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getGame_Name() {
        return Game_Name;
    }

    public void setGame_Name(String game_Name) {
        Game_Name = game_Name;
    }

    public int getRelease_Year() {
        return Release_Year;
    }

    public void setRelease_Year(int release_Year) {
        Release_Year = release_Year;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }
}
