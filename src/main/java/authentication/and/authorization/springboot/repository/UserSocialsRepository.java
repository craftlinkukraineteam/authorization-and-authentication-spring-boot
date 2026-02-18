package authentication.and.authorization.springboot.repository;

import authentication.and.authorization.springboot.entity.UserSocials;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface UserSocialsRepository extends JpaRepository<UserSocials, Long> {
    List<UserSocials> findByUserId(Long userId);
    Optional<UserSocials> findByProviderAndProviderUserId(String provider, String providerUserId);
}