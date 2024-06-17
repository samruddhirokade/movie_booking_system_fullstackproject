package com.SecurityBoat.Movie_Ticket_Booking_System.dto;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="movie_id")
	private int id;
	
	@Column(name="movie_title")
	private String title;
	
	
	@Column(name="movie_type")
	private String type;
	
	
	@Column(name="movie_showtime")
	private LocalDateTime showtime;

}
