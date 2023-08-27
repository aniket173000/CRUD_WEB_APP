package com.example.crud_web_app.users;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

}
