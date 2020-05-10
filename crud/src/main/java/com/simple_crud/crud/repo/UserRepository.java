package com.simple_crud.crud.repo;


import com.simple_crud.crud.entites.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    List<User> findByName(String name);


    void save(User user);

    Object findAll();

    <T> Optional<T> findById(long id);

    void delete(User user);
}
