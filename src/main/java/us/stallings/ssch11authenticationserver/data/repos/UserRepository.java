package us.stallings.ssch11authenticationserver.data.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import us.stallings.ssch11authenticationserver.data.entities.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByUsername(String username);
}
