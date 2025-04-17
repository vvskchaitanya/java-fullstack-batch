import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Booking, Movie } from '../app.models';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  apiUrl:string = "http://localhost:8080";

  selectedMovie: Movie | undefined;

  movies: Observable<Movie[]>  = new Observable<Movie[]>();

  constructor(private http:HttpClient) {
    console.log('MovieService constructor called');
    
    this.movies = this.http.get<Movie[]>(this.apiUrl+"/movies");
   }

   addMovie(movie:Movie):Observable<Movie> {
    console.log('MovieService addMovie called',movie);
    return this.http.post<Movie>(this.apiUrl+"/movies",movie);
   }


   createBooking(name:string, date:string,seats:number):Observable<Booking> {
    let booking: Booking = {id:null,name:name,date:date,seats:seats};
    console.log('BookingService createBooking called',booking);
    return this.http.post<Booking>(this.apiUrl+"/bookings",booking);
   }
}
