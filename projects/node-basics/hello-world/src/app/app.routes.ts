import { Routes } from '@angular/router';
import { MoviesComponent } from './book-my-show/movies/movies.component';
import { EventsComponent } from './book-my-show/events/events.component';
import { MovieComponent } from './movie/movie.component';

export const routes: Routes = [
    {path: '', component:MoviesComponent, pathMatch: 'full'},
    {path: 'movies', component:MoviesComponent, pathMatch: 'full'},
    {path: 'events', component:EventsComponent, pathMatch: 'full'},
    {path: 'movie', component: MovieComponent, pathMatch: 'full'},
];
