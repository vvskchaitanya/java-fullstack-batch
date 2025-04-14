import { Component } from '@angular/core';
import { MoviesComponent } from './movies/movies.component';
import { EventsComponent } from './events/events.component';
import { HeaderComponent } from './header/header.component';
import { NgIf } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-book-my-show',
  imports: [HeaderComponent, RouterOutlet],
  templateUrl: './book-my-show.component.html',
  styleUrl: './book-my-show.component.css'
})
export class BookMyShowComponent {

  view:string = "movies";

}
