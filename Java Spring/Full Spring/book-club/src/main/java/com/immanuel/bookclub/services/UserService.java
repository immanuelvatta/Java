package com.immanuel.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.immanuel.bookclub.models.Book;
import com.immanuel.bookclub.models.LoginUser;
import com.immanuel.bookclub.models.User;
import com.immanuel.bookclub.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        
        // TO-DO - Reject values or register if no errors:
        if(userRepository.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "Email is already in use!");
        }
        // Reject if email is taken (present in database)
        // Reject if password doesn't match confirmation
        if (!newUser.getPassword().equals(newUser.getConfirm())) { // Check to make sure password matches confirm
            // password
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        
        // Return null if result has errors
        if(result.hasErrors()) {
            return null;
        }
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        // Hash and set password, save user to database
        return userRepository.save(newUser);
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        Optional<User> user = userRepository.findByEmail(newLoginObject.getEmail());
        if (!user.isPresent()){
            result.rejectValue("email", "Unique", "Email not found!");
        }else if (!BCrypt.checkpw(newLoginObject.getPassword(), user.get().getPassword())) {
            result.rejectValue("password", "Unique", "Invalid Credentials!");
        }
        if (result.hasErrors()){
            return null;
        }
        return user.get();
    }
    public User getUserById(Long attribute) {
        return userRepository.findById(attribute).orElse(null);
    }
}