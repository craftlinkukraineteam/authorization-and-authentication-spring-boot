package authentication.and.authorization.springboot.entity;

import jakarta.persistence.*;
import java.security.Timestamp;

public class UserSocials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String provider;
    private String providerUserId;
    private String email;
    private String accessToken;
    private String refreshToken;
    private Timestamp tokenExpiresAt;
    private Boolean isLinked;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
