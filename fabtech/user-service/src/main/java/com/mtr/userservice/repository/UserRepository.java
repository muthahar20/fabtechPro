package com.mtr.userservice.repository;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;
import com.mtr.userservice.model.User;
import jakarta.persistence.EntityManager;

@Repository
public class UserRepository extends SimpleJpaRepository<User, Long>{

	public UserRepository(Class<User> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		// TODO Auto-generated constructor stub
	}

}
