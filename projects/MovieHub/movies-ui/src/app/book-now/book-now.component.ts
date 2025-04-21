import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Movie } from '../app.models';
import { MovieService } from '../services/movie.service';
import { Router } from '@angular/router';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-book-now',
  templateUrl: './book-now.component.html',
  styleUrls: ['./book-now.component.css'],
  imports: [FormsModule,NgIf],
  standalone: true,
})
export class BookNowComponent {
  movie:Movie | undefined;
  selectedDate: string = '';
  numberOfSeats: number = 1;

  constructor(private moviesService: MovieService,private router:Router) { 
    this.movie = moviesService.selectedMovie;
  }

  bookMovie() {
    // Implement booking logic here
    console.log('Booking Details:');
    console.log('Movie:', this.movie?.name);
    console.log('Date:', this.selectedDate);
    console.log('Seats:', this.numberOfSeats);
    this.moviesService.createBooking(this.movie?.name || '', this.selectedDate, this.numberOfSeats)
    .subscribe((response) => {
      console.log('Booking response:', response); 
    alert('Booking confirmed for ' + response.seats + ' seats on ' + response.date + ' for ' + this.movie?.name + '.');
    this.router.navigate(['/movies']);
    });
  }
}
