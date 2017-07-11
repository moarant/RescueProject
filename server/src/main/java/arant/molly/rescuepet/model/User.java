package arant.molly.rescuepet.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by mollyarant on 6/30/17.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
    private long id;
    @Column(name="USERNAME")
    private String username;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="NAME")
    private String name;

    //indicates that one user can have more than one pet

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="USER_ID")
    private Set<Pet> pets;


    public User(String username, String password, String name){
        this.username= username;
        this.password = password;
        this.name= name;
    }

    public User(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {return name; }

    public void setName(String name) { this.name = name;}

    public Set<Pet> getPets() { return pets;  }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

}
