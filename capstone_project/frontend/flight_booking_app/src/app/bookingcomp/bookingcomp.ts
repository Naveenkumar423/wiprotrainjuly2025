import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService } from '../booking';
import { BookingRequest } from '../models/booking-request.dto';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-bookingcomp',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './bookingcomp.html',
  styleUrls: ['./bookingcomp.css']
})
export class Bookingcomp implements OnInit {
  request: BookingRequest = {
    flightId: '',
    userEmail: '',
    travelDate: '',
    amount: 0,
    mode: '',
    username: '',
    gender: '',
    age: 0
  };

  constructor(
    private route: ActivatedRoute,
    private bookingService: BookingService,
    private router: Router
  ) {}

  ngOnInit(): void {
    
    this.request.flightId = this.route.snapshot.paramMap.get('flightId') || '';

    if (this.request.flightId) {
      console.log('Fetching flight by ID:', this.request.flightId);
      this.bookingService.getFlightById(this.request.flightId).subscribe({
        next: (flight: any) => {
          console.log('Flight data:', flight);
          this.request.amount = flight.price;
        },
        error: (err) => {
          console.error('Error fetching flight:', err);
        }
      });
    }
  }

  submitBooking(): void {
    console.log('Submitting booking request:', this.request);
    this.bookingService.bookFlight(this.request).subscribe({
      next: (res: any) => {
        console.log('Booking success:', res);
        const bookingId = res.bookingId;
        this.router.navigate(['/payment', bookingId]);
      },
      error: (err) => {
        console.error('Booking failed:', err);
        alert('Booking failed. Please try again.');
      }
    });
  }
}
