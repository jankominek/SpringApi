package com.SpringApi.SpringApi.interfaces;

import com.SpringApi.SpringApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
