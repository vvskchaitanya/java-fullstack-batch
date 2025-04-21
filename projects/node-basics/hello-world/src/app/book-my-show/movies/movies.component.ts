import { NgFor } from '@angular/common';
import { Component } from '@angular/core';
import { Movie } from '../../app.models';
import { MovieService } from '../../services/movie.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-movies',
  imports: [NgFor],
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent {

  movies: Movie[] = [];
    
  constructor(private moviesService: MovieService,private router:Router) { 
    moviesService.movies.subscribe((data: Movie[]) => {
      this.movies = data;
    },error =>{
      console.log('Error while fetching movies',error);
    }
    );
  }

    bookTicket(movie: any) {
        this.moviesService.selectedMovie = movie;
        this.router.navigate(['/movie']);
    }
}
