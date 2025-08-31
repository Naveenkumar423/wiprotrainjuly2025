import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService } from '../booking';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-payment',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './payment.html',
  styleUrls: ['./payment.css']   // fixed styleUrls (plural)
})
export class Payment {
  bookingId!: string;
  mode: string = 'CARD';

  constructor(
    private route: ActivatedRoute,
    private bookingService: BookingService,
    private router: Router
  ) {
    this.bookingId = this.route.snapshot.params['bookingId'];
  }

  simulatePayment() {
    setTimeout(() => {
      this.bookingService.getBookingStatus(this.bookingId).subscribe((res: any) => {
        if (res.status === 'Successful') {
          this.router.navigate(['/success', this.bookingId]);
        } else {
          this.router.navigate(['/failure']);
        }
      });
    }, 3000);
  }
}
