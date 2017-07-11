package arant.molly.rescuepet.controller;

import arant.molly.rescuepet.model.Post;
import arant.molly.rescuepet.repository.PostRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;

/**
 * Created by mollyarant on 7/5/17.
 */

@RequestMapping("/posts")
@RestController
@CrossOrigin("http://localhost:8100")
public class PostController {

    @Inject
    private PostRepository postRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Post>>getAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts:: add);
        return new ResponseEntity<ArrayList<Post>>(posts, HttpStatus.OK);
    }

    @RequestMapping(value= "{id}", method = RequestMethod.GET)
    public ResponseEntity<Post>get(@PathVariable("id") long id){
        Post targetPost= postRepository.findOne(id);
        if(targetPost ==null){
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Post>(targetPost, HttpStatus.OK);
    }

    @RequestMapping(value= "/", method = RequestMethod.POST)
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        postRepository.save(post);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    @RequestMapping(value= "/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<Void> deleteQuote(@PathVariable("id") long id){
        postRepository.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
