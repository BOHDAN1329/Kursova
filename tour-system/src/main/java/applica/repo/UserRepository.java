package applica.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import applica.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}