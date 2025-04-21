import { NgFor } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-events',
  imports: [NgFor],
  templateUrl: './events.component.html',
  styleUrl: './events.component.css'
})
export class EventsComponent {

  public events = [
    {
      name: "Music Fest 2025",
      date: "2025-05-20",
      time: "6:00 PM",
      hostedBy: "Live Nation",
      img: "https://example.com/music-fest.jpg"
    },
    {
      name: "Tech Conference",
      date: "2025-06-15",
      time: "10:00 AM",
      hostedBy: "TechWorld Inc.",
      img: "https://example.com/tech-conference.jpg"
    },
    {
      name: "Art Exhibition",
      date: "2025-07-10",
      time: "2:00 PM",
      hostedBy: "Art Lovers Society",
      img: "https://example.com/art-exhibition.jpg"
    },
    {
      name: "Food Carnival",
      date: "2025-08-05",
      time: "12:00 PM",
      hostedBy: "Gourmet Events",
      img: "https://example.com/food-carnival.jpg"
    },
    {
      name: "Stand-Up Comedy Night",
      date: "2025-09-12",
      time: "8:00 PM",
      hostedBy: "Laugh Out Loud",
      img: "https://example.com/comedy-night.jpg"
    }
  ];


  register(event: any) {
    alert("You have successfully registered for the event " + event.name + "!");
  }

}
