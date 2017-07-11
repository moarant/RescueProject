import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { ListPage } from '../pages/list/list';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { AdoptPageLoginPage } from "../pages/adopt-page-login/adopt-page-login";
import { SelectViewAdoptablePetsPage } from "../pages/select-view-adoptable-pets/select-view-adoptable-pets";

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    ListPage,
    AdoptPageLoginPage, 
    SelectViewAdoptablePetsPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    ListPage,
    AdoptPageLoginPage,
    SelectViewAdoptablePetsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
