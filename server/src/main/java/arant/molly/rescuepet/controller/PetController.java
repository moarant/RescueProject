package arant.molly.rescuepet.controller;

import arant.molly.rescuepet.model.Pet;
import arant.molly.rescuepet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;

/**
 * Created by mollyarant on 7/5/17.
 */
@RequestMapping("/pets")
@RestController
@CrossOrigin("http://localhost:8100")
public class PetController {

    @Inject
    private PetRepository petRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Pet>>getAllPets(){
        ArrayList<Pet> pets= new ArrayList<>();
        petRepository.findAll().forEach(pets::add);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public ResponseEntity<Pet> get(@PathVariable("id") long id){
        Pet targetPet= petRepository.findOne(id);
        if(targetPet == null){
            return new ResponseEntity<Pet>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pet>(targetPet, HttpStatus.OK);
    }

    @RequestMapping(value= "/", method= RequestMethod.POST)
    public ResponseEntity<Pet> createPet(@RequestBody Pet pet){
        petRepository.save(pet);
        return new ResponseEntity<Pet>(pet, HttpStatus.CREATED);
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deletePet(@PathVariable("id") long id){
        petRepository.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value= "/{id}", method= RequestMethod.PUT)
    public ResponseEntity<Pet>editPet(@PathVariable long id, @RequestBody Pet pet){
        Pet targetPet= petRepository.findOne(id);

        if(targetPet == null) {
            return new ResponseEntity<Pet>(HttpStatus.NOT_FOUND);
        }

        targetPet.setLocation(pet.getLocation());
        targetPet.setName(pet.getName());
        targetPet.setPetAge(pet.getPetAge());
        targetPet.setPetType(pet.getPetType());
        targetPet.setRescueAgency(pet.getRescueAgency());
        petRepository.save(pet);

        return new ResponseEntity<Pet>(targetPet, HttpStatus.OK);

    }



}
