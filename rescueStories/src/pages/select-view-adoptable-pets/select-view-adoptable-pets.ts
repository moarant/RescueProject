import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import {SelectViewAdoptablePetsService} from './selectViewAdoptablePetsService';
import {Http} from '@angular/http';

/**
 * Generated class for the SelectViewAdoptablePetsPage page.
 *
 * See http://ionicframework.com/docs/components/#navigation for more info
 * on Ionic pages and navigation.
 */
@IonicPage()
@Component({
  selector: 'page-select-view-adoptable-pets',
  templateUrl: 'select-view-adoptable-pets.html',
  providers:[SelectViewAdoptablePetsService]
})
export class SelectViewAdoptablePetsPage {
  pets: any;

  constructor(public navCtrl: NavController, public selectViewAdoptablePetsService:SelectViewAdoptablePetsService) {
    selectViewAdoptablePetsService.getAllPets().subscribe(data =>{
      this.pets = data;
    })
  }
    pet = {
    pet_id: Number,
    name: "",
    petType: "",
    petAge: "",
    rescueAgency: "",
    location: "",
    picture: "",
    userId: Number
  }
  
   getPets(){
      this.selectViewAdoptablePetsService.getAllPets().subscribe(data =>{
      this.pets = data;
  })
  }



  ionViewDidLoad() {
    console.log('ionViewDidLoad SelectViewAdoptablePetsPage');
  }

}
