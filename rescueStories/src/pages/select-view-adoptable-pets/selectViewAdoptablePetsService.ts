import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { SelectViewAdoptablePetsPage } from './select-view-adoptable-pets';
import{Http, Response, Headers} from '@angular/http';
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Injectable} from '@angular/core';

@Injectable()
export class SelectViewAdoptablePetsService {
    constructor(private _http:Http){

    }

    getAllPets() : Observable<any> {
        return this._http.get("http://localhost:8080/pets/")
            .map(response => response.json());
    }

    getPet(id: Number): Observable <any>{
        return this._http.get("http://(localhost:8080/pets/" + id +"/")
        .map(response => response.json());

    }



}
