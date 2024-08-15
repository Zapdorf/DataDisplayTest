package AndrewVandercar.DataDisplayTest.GameTitle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>
{
    List<Game> findAll();

    @Query("SELECT g FROM Game g WHERE g.Game_Name = :name")
    Optional<Game> GetGameByName(@Param("name") String name);

}
