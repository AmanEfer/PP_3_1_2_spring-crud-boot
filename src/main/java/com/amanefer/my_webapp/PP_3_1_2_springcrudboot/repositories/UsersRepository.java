package com.amanefer.my_webapp.PP_3_1_2_springcrudboot.repositories;


import com.amanefer.my_webapp.PP_3_1_2_springcrudboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
