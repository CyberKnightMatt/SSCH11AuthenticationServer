package us.stallings.ssch11authenticationserver.data.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import us.stallings.ssch11authenticationserver.data.entities.Otp;

import java.util.Optional;

public interface OtpRepository extends JpaRepository<Otp, String> {
    Optional<Otp> findOtpByUsername(String username);
}
