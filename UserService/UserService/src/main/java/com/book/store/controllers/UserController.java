package com.book.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.store.dto.BasicResponseDTO;
import com.book.store.dto.UpdateAuthorDTO;
import com.book.store.models.User;
import com.book.store.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PutMapping("/Author-details-update")
    public ResponseEntity<BasicResponseDTO<User>> updateAuthor(@RequestBody UpdateAuthorDTO r){
    User userUpdate = userService.updateAuthor(r);
    return new ResponseEntity<>(new BasicResponseDTO<>(true, "User updated", userUpdate), HttpStatus.OK);

    }
	
	@GetMapping("/users")
    public ResponseEntity<BasicResponseDTO<List<User>>> allUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(new BasicResponseDTO<>(true, "Users list", users), HttpStatus.OK);
    }
	
	 @GetMapping("/author-details/{userId}")
	 public ResponseEntity<BasicResponseDTO<User>> authorDetails(@PathVariable("userId") Long userId){
		 User user = userService.getAuthorDetails(userId);
	     return new ResponseEntity<>(new BasicResponseDTO<>(true, "Author details", user), HttpStatus.OK);
	     }

}
