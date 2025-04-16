import { Injectable } from '@angular/core';
import { Movie } from '../app.models';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  selectedMovie: Movie | undefined;

  movies: Observable<Movie[]>  = new Observable<Movie[]>();

  constructor(private http:HttpClient) { 
    console.log('MovieService constructor called');
    
    this.movies = this.http.get<Movie[]>('/movies.json');
  }

}


