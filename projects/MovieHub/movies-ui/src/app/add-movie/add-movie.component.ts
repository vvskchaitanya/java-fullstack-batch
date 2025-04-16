import { Component } from '@angular/core';
import { Movie } from '../app.models';
import { FormsModule, NgForm, NgModel } from '@angular/forms';
import { MovieService } from '../services/movie.service';

@Component({
  selector: 'app-add-movie',
  imports: [FormsModule],
  templateUrl: './add-movie.component.html',
  styleUrl: './add-movie.component.css'
})
export class AddMovieComponent {

  movie: Movie = {
    id: 0,
    name: '',
    img: '',
    cast: '',
    year: 0,
    rating: 0,
    plot: ''
  };

  constructor(private movieService: MovieService) {

  }

  addMovie() {
    this.movie.id = null;
    this.movieService.addMovie(this.movie).subscribe((data: Movie) => {
      console.log('Movie added successfully:', data);
      alert('Movie added successfully' + data.name);
    });
  }

}
