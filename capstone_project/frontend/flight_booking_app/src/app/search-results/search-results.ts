import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FlightDTO } from '../models/flight.dto';
import { BookingService } from '../booking';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { SearchDTO } from '../models/search.dto';

@Component({
  selector: 'app-search-results',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './search-results.html',
  styleUrls: ['./search-results.css']
})
export class SearchResults {
  flights: FlightDTO[] = [];
  filteredFlights: FlightDTO[] = [];
  airlines = ["Indigo", "Air India", "SpiceJet", "GoAir"];
  selectedAirlines: string[] = [];

  constructor(private bookingService: BookingService, private router: Router) {
    const search: SearchDTO = history.state;
    if (search.source && search.destination && search.date) {
      this.bookingService.searchFlights(search).subscribe((data: FlightDTO[]) => {
        this.flights = data;
        this.filteredFlights = data;
      });
    }
  }

  book(flightId: string) {
    this.router.navigate(['/booking', flightId]);
  }

  applyFilters() {
    this.filteredFlights = this.flights.filter(f =>
      this.selectedAirlines.length === 0 || this.selectedAirlines.includes(f.airline)
    );
  }

  onAirlineFilterChange(event: any, airline: string) {
    if (event.target.checked) {
      this.selectedAirlines.push(airline);
    } else {
      this.selectedAirlines = this.selectedAirlines.filter(a => a !== airline);
    }
    this.applyFilters();
  }

  getDuration(start: string | Date, end: string | Date): string {
    const startDate = new Date(start);
    const endDate = new Date(end);
    const diffMs = endDate.getTime() - startDate.getTime();
    const days = Math.floor(diffMs / (1000 * 60 * 60 * 24));
    return `${days} days`;
  }
}
