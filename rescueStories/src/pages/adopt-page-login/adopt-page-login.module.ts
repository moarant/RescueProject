import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { AdoptPageLoginPage } from './adopt-page-login';

@NgModule({
  declarations: [
    AdoptPageLoginPage,
  ],
  imports: [
    IonicPageModule.forChild(AdoptPageLoginPage),
  ],
  exports: [
    AdoptPageLoginPage
  ]
})
export class AdoptPageLoginPageModule {}