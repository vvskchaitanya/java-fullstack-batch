import { Routes } from '@angular/router';
import { MoviesComponent } from './book-my-show/movies/movies.component';
import { EventsComponent } from './book-my-show/events/events.component';

export const routes: Routes = [
    {path: 'movies', component:MoviesComponent, pathMatch: 'full'},
    {path: 'events', component:EventsComponent, pathMatch: 'full'}
];
