package arant.molly.rescuepet.controller;

import arant.molly.rescuepet.model.User;
import arant.molly.rescuepet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;

/**
 * Created by mollyarant on 7/5/17.
 */
@RequestMapping("/users")
@RestController
@CrossOrigin("http://localhost:8100")
public class UserController {
    @Inject
    private UserRepository userRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<User>>getAllUsers(){
        ArrayList<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        //System.out.println(users.get(0));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value= "{id}", method = RequestMethod.GET)
    public ResponseEntity<User> get(@PathVariable("id") long id){
        User targetUser= userRepository.findOne(id);
        if(targetUser == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(targetUser, HttpStatus.OK);
    }

    @RequestMapping(value= "/", method= RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    @RequestMapping(value= "/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<Void>deleteUser(@PathVariable("id") long id){
        userRepository.delete(id);
        return new ResponseEntity<> (HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> editUser(@PathVariable long id, @RequestBody User user){
        User targetUser = userRepository.findOne(id);

        if(targetUser== null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }

        targetUser.setPassword(user.getPassword());
        targetUser.setUsername(user.getUsername());
        targetUser.setName(user.getName());
        targetUser.setPets(user.getPets());
        userRepository.save(user);

        return new ResponseEntity<User>(targetUser, HttpStatus.OK);
    }

}
