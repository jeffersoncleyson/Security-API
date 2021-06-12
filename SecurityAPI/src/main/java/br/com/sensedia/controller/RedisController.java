package br.com.sensedia.controller;

import br.com.sensedia.config.Routers;
import br.com.sensedia.model.User;
import br.com.sensedia.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(value = Routers.REDIS_USER)
public class RedisController {

    @Autowired
    private UserRepository userRepository;

    @Operation(summary = "Save User", description = "Store user on Redis Cache", tags = { "Redis" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User saved"),
    })
    @RolesAllowed("admin")
    @PostMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        userRepository.addUser(user);
        return ResponseEntity.ok("Save User on Cache");
    }

    @Operation(summary = "Fetch Users from Redis Cache", description = "List of Users from Redis Cache", tags = { "Redis" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation",
                    content = @Content(array = @ArraySchema(schema = @Schema(implementation = User.class)))),
    })
    @RolesAllowed("admin")
    @GetMapping(value = Routers.REDIS_ALL_USERS)
    public ResponseEntity<?> getAllUsersFromRedis() {
        return ResponseEntity.ok(userRepository.findAllUsers());
    }

    @Operation(summary = "Fetch User", description = "Get user by username", tags = { "Redis" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User found",
                    content = @Content(schema = @Schema(implementation = User.class)))
    })
    @RolesAllowed("admin")
    @GetMapping(value = Routers.REDIS_USERBYUSERNAME_USER)
    public ResponseEntity<?> getUserFromRedis(@PathVariable String username) {
        return ResponseEntity.ok(userRepository.findUserByUsername(username));
    }

    @Operation(summary = "Update User", description = "Update all fields user on Redis Cache", tags = { "Redis" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User updated", content = @Content(schema = @Schema(implementation = String.class))),
    })
    @RolesAllowed("admin")
    @PutMapping
    public ResponseEntity<?> updateUserFromRedis(@RequestBody User user) {
        userRepository.updateUser(user);
        return ResponseEntity.ok("Updated User on Cache");
    }

    @Operation(summary = "Deleted User", description = "Delete user by username from Redis Cache", tags = { "Redis" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User updated", content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "404", description = "User not found"),
    })
    @RolesAllowed("admin")
    @DeleteMapping(value = Routers.REDIS_USERBYUSERNAME_USER)
    public ResponseEntity<?> deleteUserFromRedis(@PathVariable String username) {
        boolean success = userRepository.deleteUserByUsername(username);
        if(success) return ResponseEntity.ok("Deleted User Cache");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("");
    }
}
