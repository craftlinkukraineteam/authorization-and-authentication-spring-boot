package authentication.and.authorization.springboot.repository;

import authentication.and.authorization.springboot.entity.AuditLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AuditLogsRepository extends JpaRepository<AuditLogs, Long> {
    List<AuditLogs> findByUserId(Long userId);
}