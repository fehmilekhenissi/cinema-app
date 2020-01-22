package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.cinema.dao.Cinema;
@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long>{
	
	//List<Cinema> findById(Long id);
	List<Cinema> findByName(String name);

}
