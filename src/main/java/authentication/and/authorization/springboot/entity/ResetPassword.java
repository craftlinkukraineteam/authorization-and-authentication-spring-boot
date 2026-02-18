package authentication.and.authorization.springboot.entity;

import jakarta.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "reset_password")
public class ResetPassword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tokenHash;
    @Column(name = "expires_at")
    private Timestamp expiresAt;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
