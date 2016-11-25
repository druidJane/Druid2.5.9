package com.druid.dao;

import com.druid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by druid on 24/11/16.
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
