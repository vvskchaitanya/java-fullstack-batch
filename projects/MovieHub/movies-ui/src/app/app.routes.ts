import { Routes } from '@angular/router';
import { MoviesComponent } from './movies/movies.component';
import { AddMovieComponent } from './add-movie/add-movie.component';
import { MovieComponent } from './movie/movie.component';
import { BookNowComponent } from './book-now/book-now.component';

export const routes: Routes = [
    {path:"",component:MoviesComponent},
    {path:"movies",component:MoviesComponent},
    {path:"add-movie",component:AddMovieComponent},
    {path:"movie",component:MovieComponent},
    {path:"book-now",component:BookNowComponent}
];
