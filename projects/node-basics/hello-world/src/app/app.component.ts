import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { H100Component } from './h100/h100.component';
import { BookMyShowComponent } from './book-my-show/book-my-show.component';
import { MovieService } from './services/movie.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,H100Component,BookMyShowComponent],
  providers : [MovieService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  message:string="Welcome to Angular world";
  count:number=50;
  check:boolean = true;
}
