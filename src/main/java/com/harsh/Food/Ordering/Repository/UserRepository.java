package com.harsh.Food.Ordering.Repository;

import com.harsh.Food.Ordering.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByEmail(String userName);

}
