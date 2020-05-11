package com.simple_crud.crud.repo;


import com.simple_crud.crud.entites.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@Repository
public interface UserRepository {

    List<User> findByName(String name);

    void save(User user);

    Object findAll();

    OptionalLong findById(long id);

    void delete(long user);
}
