package com.SecurityBoat.Movie_Ticket_Booking_System.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SecurityBoat.Movie_Ticket_Booking_System.dto.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	
	boolean existsByMovieIdAndSeatsIn(Long movieId,List<String> seats);

}
