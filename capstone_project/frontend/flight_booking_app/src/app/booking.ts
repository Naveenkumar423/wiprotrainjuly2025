import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SearchDTO } from './models/search.dto';
import { FlightDTO } from './models/flight.dto';
import { BookingRequest } from './models/booking-request.dto';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  private bookingBaseUrl = 'http://localhost:8081/bookings';
  private flightBaseUrl = 'http://localhost:8082/flights';

  constructor(private http: HttpClient) {}

  searchFlights(dto: SearchDTO): Observable<FlightDTO[]> {
    return this.http.get<FlightDTO[]>(`${this.flightBaseUrl}/search?source=${dto.source}&destination=${dto.destination}&date=${dto.date}`);
  }

  bookFlight(req: BookingRequest): Observable<any> {
    return this.http.post(`${this.bookingBaseUrl}/book`, req);
  }

  getBookingStatus(bookingId: string): Observable<any> {
    return this.http.get<any>(`${this.bookingBaseUrl}/status?bookingId=${bookingId}`);
  }

  getFlightById(flightId: string): Observable<FlightDTO> {
    return this.http.get<FlightDTO>(`${this.flightBaseUrl}/${flightId}`);
  }
}
