package authentication.and.authorization.springboot.repository;

import authentication.and.authorization.springboot.entity.ResetPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ResetPasswordRepository extends JpaRepository<ResetPassword, Long> {
    Optional<ResetPassword> findByTokenHash(String tokenHash);
}