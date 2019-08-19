import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { ShowComponent } from './showProduct';
import {HttpClientModule} from '@angular/common/http';
import {Router, RouterModule, Routes} from '@angular/router';
//import { Main } from './main';

const routes:Routes=[{path:'',redirectTo:'show',pathMatch:'full'},
 {path:'show',component:ShowComponent}];

@NgModule({
    imports: [
        BrowserModule,HttpClientModule,RouterModule.forRoot(routes),
        
    ],
    declarations: [
        AppComponent,ShowComponent
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }