package com.simple_crud.crud.repo;


import com.simple_crud.crud.entites.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    List<User> findByName(String name);


}
