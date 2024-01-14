package com.xdebuggers.csframeworkapp.repository.h2;

import org.springframework.data.repository.CrudRepository;

import com.xdebuggers.csframeworkapp.model.h2.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
