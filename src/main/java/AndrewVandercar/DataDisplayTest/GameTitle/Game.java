package AndrewVandercar.DataDisplayTest.GameTitle;


import jakarta.persistence.Entity;

public class Game {
    /*
    For object mapping to the database
     */

    public int ID;
    public String GameName;
    public int ReleaseYear;
    public String Platform;

    public Game(int ID, String gameName, int releaseYear, String platform) {
        this.ID = ID;
        GameName = gameName;
        ReleaseYear = releaseYear;
        Platform = platform;
    }
}
