package br.com.sensedia.repository;

import br.com.sensedia.config.Routers;
import br.com.sensedia.model.User;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Getter
public class UserRepository {

    @Autowired
    private RedisTemplate<String,User> redUserRedisTemplate;

    private void storeUserToRedis(User user){
        redUserRedisTemplate.opsForHash().put(Routers.USER_BASE_ROUTE, user.getUsername(), user);
    }

    public void addUser(User user){
        storeUserToRedis(user);
    }

    public void updateUser(User user){
        storeUserToRedis(user);
    }

    public boolean deleteUserByUsername(String username){
        if(findUserByUsername(username) != null) {
            redUserRedisTemplate.opsForHash().delete(Routers.USER_BASE_ROUTE, username);
            return true;
        }
        return false;
    }

    public User findUserByUsername(String username){
        Object userFind = redUserRedisTemplate.opsForHash().get(Routers.USER_BASE_ROUTE, username);
        return userFind instanceof User ? (User) userFind : null;
    }

    public Map<Object, Object> findAllUsers(){
        return redUserRedisTemplate.opsForHash().entries(Routers.USER_BASE_ROUTE);
    }

}
