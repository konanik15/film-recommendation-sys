package pl.agh.edu.recomendationsystem.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agh.edu.recomendationsystem.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
