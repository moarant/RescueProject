import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { SelectViewAdoptablePetsPage } from './select-view-adoptable-pets';

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
export class SelectViewAdoptablePetsPageModule {}
