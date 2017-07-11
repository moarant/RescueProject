import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { CreateAdoptPageLoginPage } from './create-adopt-page-login';

@NgModule({
  declarations: [
    CreateAdoptPageLoginPage,
  ],
  imports: [
    IonicPageModule.forChild(CreateAdoptPageLoginPage),
  ],
  exports: [
    CreateAdoptPageLoginPage
  ]
})
export class CreateAdoptPageLoginPageModule {}
