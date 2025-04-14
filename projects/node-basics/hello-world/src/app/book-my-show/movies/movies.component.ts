import { NgFor } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-movies',
  imports: [NgFor],
  templateUrl: './movies.component.html',
  styleUrl: './movies.component.css'
})
export class MoviesComponent {
    movies = [
      {
        name: "Inception",
        img: "https://m.media-amazon.com/images/I/51zUbui+gbL._AC_.jpg",
        cast: ["Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page", "Tom Hardy"],
        year: 2010,
        rating: 8.8,
        plot: "A skilled thief, who steals corporate secrets through the use of dream-sharing technology, is given the inverse task of planting an idea into the mind of a CEO, but his tragic past may doom the project and his team to disaster."
      },
      {
        name: "The Dark Knight",
        img: "https://m.media-amazon.com/images/I/51k0qa6zY-L._AC_.jpg",
        cast: ["Christian Bale", "Heath Ledger", "Aaron Eckhart", "Michael Caine"],
        year: 2008,
        rating: 9.0,
        plot: "When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham. The Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice."
      },
      {
        name: "Interstellar",
        img: "https://m.media-amazon.com/images/I/71y7x3MHZ-L._AC_SY679_.jpg",
        cast: ["Matthew McConaughey", "Anne Hathaway", "Jessica Chastain", "Michael Caine"],
        year: 2014,
        rating: 8.6,
        plot: "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival as Earth faces environmental collapse."
      },
      {
        name: "The Shawshank Redemption",
        img: "https://m.media-amazon.com/images/I/51NiGlapXlL._AC_.jpg",
        cast: ["Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler"],
        year: 1994,
        rating: 9.3,
        plot: "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."
      },
      {
        name: "The Avengers",
        img: "https://m.media-amazon.com/images/I/71xZxIXy2CL._AC_SY679_.jpg",
        cast: ["Robert Downey Jr.", "Chris Evans", "Scarlett Johansson", "Mark Ruffalo"],
        year: 2012,
        rating: 8.0,
        plot: "Earth's mightiest heroes must come together and learn to fight as a team if they are to stop the mischievous Loki and his alien army from enslaving humanity."
      }
    ];

    bookTicket(movie: any) {
        alert(`You have successfully booked a ticket for ${movie.name}!`); 
    }
}
