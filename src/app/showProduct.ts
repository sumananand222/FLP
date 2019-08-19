    
import { Component,} from "@angular/core";
import {ProductService} from './productService';
import {Product} from './models/Product';

@Component({
    selector:'show-product',
    templateUrl:'showproduct.html'
})

export class ShowComponent {
    constructor(private service:ProductService){}
    products:Product[]=[];

    product:Product;
   
    ngOnInit(): void {
       // throw new Error("Method not implemented.");
        this.service.findproduct().subscribe(
            res=>{
               this.product=res

            },
            err=>{
                alert("an error has occurred")
            }
        )
        
    }
    Cart()
    {
        alert("Product is added to Cart");
    }
    Wishlist()
    {
        alert("Product is added to Wishlist");
    }
      
}