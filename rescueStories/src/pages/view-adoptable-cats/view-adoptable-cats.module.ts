import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ViewAdoptableCatsPage } from './view-adoptable-cats';

@NgModule({
  declarations: [
    ViewAdoptableCatsPage,
  ],
  imports: [
    IonicPageModule.forChild(ViewAdoptableCatsPage),
  ],
  exports: [
    ViewAdoptableCatsPage
  ]
})
export class ViewAdoptableCatsPageModule {}
