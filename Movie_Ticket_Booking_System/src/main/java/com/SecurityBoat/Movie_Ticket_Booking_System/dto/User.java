package com.SecurityBoat.Movie_Ticket_Booking_System.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data

@Table(name="usertable")


public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="user_id")
	private int id;
	
	@Column(name="user_name")
	private String name;
	
	
	@Column(name="user_email",unique=true)
	private String email;
	
	
	@Column(name="user_password",unique =true )
	private String password;

}
