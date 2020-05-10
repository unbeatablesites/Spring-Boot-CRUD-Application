package com.simple_crud.crud.Repo;


import com.simple_crud.crud.entites.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo {

    List<User> findByName(String name);


}
