package com.SecurityBoat.Movie_Ticket_Booking_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecurityBoat.Movie_Ticket_Booking_System.dto.FoodItem;
import com.SecurityBoat.Movie_Ticket_Booking_System.dto.Movie;
import com.SecurityBoat.Movie_Ticket_Booking_System.repo.FoodItemRepo;
import com.SecurityBoat.Movie_Ticket_Booking_System.repo.MovieRepository;

@Service
public class AdminService {

	@Autowired

	private MovieRepository movierepo;

	@Autowired

	private FoodItemRepo foodItemrepo;

	@Autowired

	public void addMovie(Movie movie)
	{
		
		movierepo.save(movie);
	}
	
	public void addFoodItem(FoodItem  fooditem)
	{
		
		foodItemrepo.save(fooditem);
	}
}

