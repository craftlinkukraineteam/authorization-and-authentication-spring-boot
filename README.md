# Authorization and Authentication
Невеликий backend‑застосунок, створений на Spring Boot, який відповідає за реєстрацію та автентифікацію користовучів у системі. Застосунок взаємодіє з frontend‑застосунком (Next.js) через REST API та використовує JWT (JSON Web Token) для аутентифікації.

## Використані технології

- Spring Boot;
- Spring Security;
- Spring Data JPA;
- Spring WebMVC;
- Lombok;
- Slf4j;
- Swagger UI;
- YAML;
- JWT (JSON Web Token);

## Логіка роботи
Серверний сервіс взаємодіє із клієнтським сервісом через такі API-ендпоінти:
```
POST   /auth/register
POST   /auth/login
POST   /auth/logout
POST   /auth/refresh
GET    /auth/profile
POST   /auth/forgot-password
POST   /auth/reset-password
POST   /auth/verify-email
```

## Cтруктура проєкту
```
├── .idea/
├── .mvn/
├── src/
    └── main/
        └── java/
             └── authentication.and.authorization.springboot/
                 ├── config/
                     ├── JwtAuthenticationFilter.java
                     └── SecurityConfig.java
                 ├── controller/
                     ├── AuthController.java
                     └── LoginController.java
                 ├── entity/
                     ├── AuditLogs.java
                     ├── RefreshToken.java
                     ├── ResetPassword.java
                     ├── User.java
                     ├── UserProfile.java
                     └── UserSocials.java
                 ├── repository/
                     ├── AuditLogsRepository.java
                     ├── RefreshTokenRepository.java
                     ├── ResetPasswordRepository.java
                     ├── UserRepository.java
                     ├── UserProfileRepository.json
                     └── UserSocialsRepository.java
                 ├── service/
                     ├── request/
                         ├── LoginRequest.java
                         └── RegisterRequest.java
                     ├── response/
                         └── AuthResponse.java
                     ├── AuthService.java
                     └── JwtService.java
                 └── MicroserviceApplication.java
        └── resources/
            ├── static/
            ├── resources/
            └── application.properties
    └── test/
        └── java/
            └── authentication.and.authorization.springboot/
                └── MicroserviceApplicationTests
├── target/
    └── classes/
        └── application.properties
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── .gitignore/
    └── .gitattributes
```

## Запуск
Запуск у IDE JetBrains WebStorm через консоль наступною командою:
```
node server.js
```

## Оновлення всіх залежностей npm до останніх версій
Запуск у IDE JetBrains WebStorm через консоль наступними командами:
```
npm install -g npm-check-updates
ncu -u
npm install
```

Встановлення залежностей
Запуск у IDE JetBrains WebStorm через консоль наступною командою:
```
npm install
```
