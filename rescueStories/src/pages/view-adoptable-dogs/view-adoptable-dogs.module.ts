import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ViewAdoptableDogsPage } from './view-adoptable-dogs';

@NgModule({
  declarations: [
    ViewAdoptableDogsPage,
  ],
  imports: [
    IonicPageModule.forChild(ViewAdoptableDogsPage),
  ],
  exports: [
    ViewAdoptableDogsPage
  ]
})
export class ViewAdoptableDogsPageModule {}
