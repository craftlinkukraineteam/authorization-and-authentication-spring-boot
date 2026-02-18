package authentication.and.authorization.springboot.controller;

import authentication.and.authorization.springboot.entity.User;
import authentication.and.authorization.springboot.service.AuthService;
import authentication.and.authorization.springboot.service.request.LoginRequest;
import authentication.and.authorization.springboot.service.request.RegisterRequest;
import authentication.and.authorization.springboot.service.response.AuthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        AuthResponse response = authService.authenticate(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
        User user = authService.register(request);
        return ResponseEntity.ok(user);
    }
}
