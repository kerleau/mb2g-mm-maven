package alex.springframework.controllers;

import alex.springframework.domain.UserCommand;
import alex.springframework.entities.User;

/**
 * Created by jt on 2018-12-16.
 */
public class UserController {

    User saveUser(UserCommand command) {

        // fake impl
        return new User();
    }

}