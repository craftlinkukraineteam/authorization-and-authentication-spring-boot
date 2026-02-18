package authentication.and.authorization.springboot.service;

import authentication.and.authorization.springboot.entity.User;
import authentication.and.authorization.springboot.repository.UserRepository;
import authentication.and.authorization.springboot.service.request.LoginRequest;
import authentication.and.authorization.springboot.service.request.RegisterRequest;
import authentication.and.authorization.springboot.service.response.AuthResponse;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public AuthResponse authenticate(LoginRequest request) {
        User user = userRepository
                .findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("A user with current email address not found."));
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid password.");
        }
        String token = jwtService.generateToken(user.getEmail());
        return new AuthResponse(token);
    }

    public User register(RegisterRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole("USER");
        user.setStatus("ACTIVE");
        return userRepository.save(user);
    }
}
