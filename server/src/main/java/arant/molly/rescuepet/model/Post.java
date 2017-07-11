package arant.molly.rescuepet.model;

import javax.persistence.*;

/**
 * Created by mollyarant on 7/5/17.
 */
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POST_ID")
    private long postId;

    @Column(name= "POST_TITLE")
    private String title;

    @Column(name= "PICTURE")
    private String picture;

    @Column(name= "MESSAGE")
    private String message;

    @Column(name= "PET_ID")
    private String petId;


    public Post(String title, String picture, String message){
        this.title= title;
        this.picture= picture;
        this.message= message;
    }

    public Post(){

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }
}
