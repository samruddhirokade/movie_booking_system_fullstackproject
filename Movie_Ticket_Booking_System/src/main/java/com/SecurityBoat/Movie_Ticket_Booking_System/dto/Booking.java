package com.SecurityBoat.Movie_Ticket_Booking_System.dto;


import java.util.List;

import org.apache.catalina.User;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="booking_system")

public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	@ManyToOne
	private User user;
	
	@Column(name="movie_booking")
	private Movie movie;
	
	
	@Column(name="number_of_Tickets")
	private int numberofTickets;
	
	
	@Column(name="avaliable_seats")
	private String seats;


	public void bookSeats(Booking booking) {
		// TODO Auto-generated method stub
		
	}


	public boolean isSeatsAvaliable(int id2, String seats2) {
		// TODO Auto-generated method stub
		return false;
	}


	
	
	
	
	

}

