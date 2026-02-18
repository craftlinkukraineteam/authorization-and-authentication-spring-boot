package authentication.and.authorization.springboot.service.response;

import lombok.Getter;

@Getter
public class AuthResponse {

    private final String token;
    private String refreshToken;
    private String role;

    public AuthResponse(String token) {
        this.token = token;
    }
}
