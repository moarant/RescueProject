import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { SelectViewAdoptablePetsPage } from "../select-view-adoptable-pets/select-view-adoptable-pets";
import { AdoptPageLoginPage } from "../adopt-page-login/adopt-page-login";


@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  selectViewAdoptablePetsPage=SelectViewAdoptablePetsPage;
   adoptPageLoginPage=AdoptPageLoginPage;

  constructor(public navCtrl: NavController) {

  }
  

}
