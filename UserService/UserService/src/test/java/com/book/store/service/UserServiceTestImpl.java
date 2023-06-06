package com.book.store.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.book.store.dao.UserDAO;
import com.book.store.dto.RegisterRequestDTO;
import com.book.store.enums.UserRoleEnum;

import com.book.store.models.User;
import com.book.store.services.UserServiceImpl;



@ExtendWith({SpringExtension.class})
@DataJpaTest
@Import(UserServiceImpl.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserServiceTestImpl {

	@Autowired
	private UserServiceImpl service;
	@Test
	public void testAddUser() {
		RegisterRequestDTO registerRequestDTO=new RegisterRequestDTO();
		 registerRequestDTO.setFirstName("Seshu");
		 registerRequestDTO.setLastName("lakshmi");
		 registerRequestDTO.setEmail("seshu@gmail.com");
		 registerRequestDTO.setPassword("ses123");
		 registerRequestDTO.setConfirmPassword("ses123");
		 registerRequestDTO.setRole(UserRoleEnum.AUTHOR);
		 
		// String result=service.re
	}

}
