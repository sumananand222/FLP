import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
//import {Observable} from 'rxjs';
import {Product} from './models/Product';
//import { identifierModuleUrl } from "@angular/compiler";

let baseUrl = "http://localhost:5000/products";

@Injectable({
    providedIn:'root'
})

export class ProductService{
    constructor(private http:HttpClient){}
    //id: number=8;

    

    getproduct()
    {       
          return this.http.get<Product[]>(baseUrl+"/get");
    }
    findproduct(){
        let options = { "headers": 
        new HttpHeaders({"Content-Type": "application/json" }) };
        return this.http.get<Product>(baseUrl+"/"+8,options);

    }
  
//     getproduct()
//     {          
// //        this.id= "8";
//         let options = { "headers": 
//         new HttpHeaders({"Content-Type": "application/json" }) };
//         return this.http.get<Product[]>(baseUrl+"/"+this.id,options);
//     }
  
    //
    
}