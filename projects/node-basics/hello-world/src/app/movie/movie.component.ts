import { Component } from '@angular/core';
import { Movie } from '../app.models';
import { MovieService } from '../services/movie.service';
import { Router } from '@angular/router';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-movie',
  imports: [NgIf],
  templateUrl: './movie.component.html',
  styleUrl: './movie.component.css'
})
export class MovieComponent {

    movie: Movie | undefined;
      
    constructor(private moviesService: MovieService,private router:Router) { 
      this.movie = moviesService.selectedMovie;
    }

    bookTicket(){
        alert("You have successfully booked a ticket for " + this.movie?.name + "!");
        this.router.navigate(['/movies']);
    }

}
