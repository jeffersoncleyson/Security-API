package br.com.sensedia.controller;

import br.com.sensedia.config.Routers;
import br.com.sensedia.model.User;
import br.com.sensedia.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(value = Routers.USER_BASE_ROUTE)
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Operation(summary = "Test Anonymous Access", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Access authorized")
    })
    @GetMapping(value = Routers.USER_ANONYMOUS_ROUTE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Hello Anonymous");
    }

    @SecurityRequirement(name = "security_auth")
    @Operation(summary = "Test User Access", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Access authorized")
    })
    @RolesAllowed("user")
    @GetMapping(value = Routers.USER_COMMON_BASE_ROUTE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Hello User");
    }

    @SecurityRequirement(name = "security_auth")
    @Operation(summary = "Test Admin Access", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Access authorized")
    })
    @RolesAllowed("admin")
    @GetMapping(value = Routers.USER_ADMIN_ROUTE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("Hello Admin");
    }

    @SecurityRequirement(name = "security_auth")
    @Operation(summary = "Test Admin and User Access", tags = { "User" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Access authorized")
    })
    @RolesAllowed({"admin", "user"})
    @GetMapping(value = Routers.USER_ALL_ROUTE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getAllUser() {
        return ResponseEntity.ok("Hello All User");
    }
}
