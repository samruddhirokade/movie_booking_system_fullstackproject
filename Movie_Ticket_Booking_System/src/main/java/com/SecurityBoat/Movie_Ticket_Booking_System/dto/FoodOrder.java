package com.SecurityBoat.Movie_Ticket_Booking_System.dto;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FoodOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	@ManyToOne

	private User user;

	private String items;

	private int quantity;

	

}
