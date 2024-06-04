package repository;

import entity.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CenterRepository extends JpaRepository<Center, Long> {

   @Query(value = "SELECT * FROM Center", nativeQuery = true)
   List<Center> getCenter();


}
