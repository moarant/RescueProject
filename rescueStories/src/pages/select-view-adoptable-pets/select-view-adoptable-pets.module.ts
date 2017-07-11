import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { SelectViewAdoptablePetsPage } from './select-view-adoptable-pets';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Injectable} from '@angular/core';
@NgModule({
  declarations: [
    SelectViewAdoptablePetsPage,
  ],
  imports: [
    IonicPageModule.forChild(SelectViewAdoptablePetsPage),
  ],
  exports: [
    SelectViewAdoptablePetsPage
  ]
})

@Injectable()
export class SelectViewAdoptablePetsPageModule {}
