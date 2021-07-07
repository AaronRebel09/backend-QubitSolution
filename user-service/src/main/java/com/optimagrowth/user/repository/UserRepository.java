package com.optimagrowth.user.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimagrowth.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>  {
    public Optional<User> findById(Long userId);
}
