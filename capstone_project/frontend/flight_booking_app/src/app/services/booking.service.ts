import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FlightDTO } from '../models/flight.dto';
import { BookingRequest } from '../models/booking-request.dto';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private apiUrl = 'http://localhost:8081'; // change port if BookingMS runs on different port

  constructor(private http: HttpClient) {}

  searchFlights(search: any): Observable<FlightDTO[]> {
    return this.http.post<FlightDTO[]>(`${this.apiUrl}/flights/search`, search);
  }

  getFlightById(flightId: string): Observable<FlightDTO> {
    return this.http.get<FlightDTO>(`${this.apiUrl}/flights/${flightId}`);
  }

  bookFlight(request: BookingRequest): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/bookings`, request);
  }
}
