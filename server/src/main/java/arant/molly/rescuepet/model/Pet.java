package arant.molly.rescuepet.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by mollyarant on 7/2/17.
 */
@Entity
@Table(name="PET")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PET_ID")
    private long petId;
    @Column(name="PET_NAME")
    private String name;
    @Column(name="PET_TYPE")
  private String petType;
    @Column(name="PET_AGE")
  private String petAge;
    @Column(name= "RESCUE_AGENCY")
  private String rescueAgency;
    @Column(name="LOCATION")
  private String location;
    @Column(name="PROFILE_PICTURE")
    private String picture;

    @Column(name= "USER_ID")
    private long userId;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name= "PET_ID")
    @OrderBy
    @Size(min= 1, max=15)
    private Set<Post> posts;



    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }

    public Pet (String name, String petType, String petAge, String rescueAgency, String location){
      this.name= name;
      this.petType=petType;
      this.petAge= petAge;
      this.rescueAgency= rescueAgency;
      this.location= location;
      this.picture= picture;
      this.userId= userId;
  }

  public Pet(){

  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public String getRescueAgency() {
        return rescueAgency;
    }

    public void setRescueAgency(String rescueAgency) {
        this.rescueAgency = rescueAgency;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
