import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Movie } from '../app.models';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  apiUrl:string = "http://localhost:8080/movies";

  movies: Observable<Movie[]>  = new Observable<Movie[]>();

  constructor(private http:HttpClient) {
    console.log('MovieService constructor called');
    
    this.movies = this.http.get<Movie[]>(this.apiUrl);
   }

   addMovie(movie:Movie):Observable<Movie> {
    console.log('MovieService addMovie called',movie);
    return this.http.post<Movie>(this.apiUrl,movie);
   }
}
