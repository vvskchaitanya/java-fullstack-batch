import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { Movie } from '../app.models';
import { MovieService } from '../services/movie.service';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-movies',
  imports: [NgFor,RouterLink],
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent {

  movies: Movie[] = [];

  constructor(private moviesService: MovieService) {
    moviesService.movies.subscribe((data: Movie[]) => {
      this.movies = data;
    },error =>{
      console.log('Error while fetching movies',error);
    }
    );
  }

  bookTicket(movie: Movie) {
    console.log('Booking ticket for movie:', movie.name);  
  }

}
