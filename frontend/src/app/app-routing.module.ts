import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CoffeeDeliveryComponent} from './coffee-delivery/coffee-delivery.component';

const routes: Routes = [

  {path: 'CoffeeDelivery', component: CoffeeDeliveryComponent},
  { path: '',  redirectTo: '/CoffeeDelivery', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
