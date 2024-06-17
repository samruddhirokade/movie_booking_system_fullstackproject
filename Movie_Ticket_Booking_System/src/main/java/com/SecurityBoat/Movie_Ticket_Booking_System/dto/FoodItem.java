package com.SecurityBoat.Movie_Ticket_Booking_System.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FoodItem {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String name;
	
	private double price;
	
	private String description;

}
