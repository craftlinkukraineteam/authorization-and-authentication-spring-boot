package authentication.and.authorization.springboot.entity;

import jakarta.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "audit_logs")
public class AuditLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;
    private String ipAddress;
    private String userAgent;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
